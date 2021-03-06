package com.mycompany.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mycompany.dbutil.DBUtil;
import com.mycompany.domain.Product;

public class ProductManagementDAO {
	 public List<Product> getAllProducts(){
	        List<Product> productList = new ArrayList<Product>();
	        try
	        {
	             
	            Connection conn = DBUtil.getConnection();
	            Statement st = conn.createStatement();
	            ResultSet rs = st.executeQuery("SELECT * FROM product");
	            while(rs.next())
	            {
	                Product product = new Product(rs.getInt("id"), rs.getString("name"), rs.getInt("price"));
	                productList.add(product);
	            }
	            DBUtil.closeConnection(conn);   
	        }
	        catch(Exception e)
	        {
	            e.printStackTrace();
	        }

	        return productList;
	    }
	 
	  public int addProduct(Product product){
	        //status displays 1 if successfully inserted data or error; successful or not
	        int status = 0;
	        try
	        {
	            Connection conn = DBUtil.getConnection();
	            PreparedStatement ps = conn.prepareStatement("INSERT INTO product VALUES(?,?,?)");
	 
	            ps.setInt(1, product.getProductId());
	            ps.setString(2, product.getProductName());
	            ps.setInt(3, product.getProductPrice());
	            status = ps.executeUpdate();   
	        }
	        catch(Exception e)
	        {
	            e.printStackTrace();
	        }
	        return status;
	    }
	  
	  public int updateProduct(Product product){
	        int status = 0;
	        try
	        {
	            Connection conn = DBUtil.getConnection();
	            PreparedStatement ps = conn.prepareStatement("UPDATE product SET name=?, price=? WHERE id=?");
	         
	            ps.setString(1, product.getProductName());
	            ps.setInt(2, product.getProductPrice());
	            ps.setInt(3, product.getProductId());
	            status = ps.executeUpdate();   
	        }
	        catch(Exception e)
	        {
	            e.printStackTrace();
	        }
	        return status;
	    }
	  
	  public int deleteProduct(int productId){
	        int status = 1;
	        try
	        {
	            Connection conn = DBUtil.getConnection();
	            PreparedStatement ps = conn.prepareStatement("DELETE FROM product where prod_id = ?");
	             
	            ps.setInt(1, productId);
	            status = ps.executeUpdate();  //if successful status should return 1

	        }
	        catch(Exception e)
	        {
	            e.printStackTrace();
	        }
	        return status;
	    }
	  
	  public List<Product> getProductByid(int productId) {
		  List<Product> productList = new ArrayList<Product>();
	        try
	        {
	             
	            Connection conn = DBUtil.getConnection();
	            Statement st = conn.createStatement();
	            ResultSet rs = st.executeQuery("SELECT * FROM product where id ="+productId);
	            while(rs.next())
	            {
	                Product product = new Product(rs.getInt("id"), rs.getString("name"), rs.getInt("price"));
	                productList.add(product);
	            }
	            DBUtil.closeConnection(conn);   
	        }
	        catch(Exception e)
	        {
	            e.printStackTrace();
	        }

	        return productList;

	  }
}
