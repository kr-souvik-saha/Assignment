package com.mycompany.app;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Scanner;

import com.mycompany.DAO.ProductManagementDAO;
import com.mycompany.domain.Product;

public class ProductManagementApp {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	static ProductManagementDAO dao=new ProductManagementDAO();
	
	
	public static void main(String[] args)throws Exception {
		String choice="";
		
		do {
			System.out.println("A. View Products");
			System.out.println("B. Add Product");
			System.out.println("C. Update Product");
			System.out.println("D. Delete Product");
			System.out.println("E. Search product");
			System.out.println("F. Exit");
			System.out.println("=================================================================");
			System.out.println("Enter an option");
			System.out.println("=================================================================");
			
			choice=br.readLine();
			choice=choice.toUpperCase();
			
			if(choice.matches("A")) {
				viewProducts();
				continue;
			}
			else if(choice.matches("B")) {
				addProduct();
				continue;
			}
			else if(choice.matches("C")) {
				updateProduct();
				continue;
			}
			else if(choice.matches("D")) {
				deleteProduct();
				continue;
			}
			else if(choice.matches("E")) {
				searchProduct();
				break;	 
			}
			else if(choice=="F") {
				System.out.println("******************************THANK YOU********************");
				System.exit(0);
			}
			else {
				System.out.println("Invalid Option! please enter again");
				continue;
			}
		}while(choice!="F");
	}
	
	public static void viewProducts() {
		List<Product> productList=dao.getAllProducts();
		
		for(Product product: productList)
        {
            //display product one by one
            displayProduct(product);
        }
        System.out.println("-----------------------------------------------");
        System.out.println("\n");
	}
	
	public static void addProduct()throws Exception {
		
		System.out.println("------------------------------------------------");
        System.out.println("Enter Product ID:");
        System.out.println("------------------------------------------------");
        int productId = Integer.parseInt(br.readLine());
        
        System.out.println("------------------------------------------------");
        System.out.println("Enter Product Name:");
        System.out.println("------------------------------------------------");
        String productName = br.readLine();
        
        System.out.println("------------------------------------------------");
        System.out.println("Enter Product Price:");
        System.out.println("------------------------------------------------");
        int productPrice = Integer.parseInt(br.readLine());
        
        Product product = new Product(productId, productName,productPrice);
        int status = dao.addProduct(product);
        if(status ==1 )
        {
            System.out.println("Product added successfully");
        }
        else
        {
            System.out.println("Opps! Some Error occured");
        }
        System.out.println("\n");
	}
	
	public static void displayProduct(Product product){
        System.out.println("Product ID: "+product.getProductId());
        System.out.println("Product Name: "+product.getProductName());
        System.out.println("Product Price: "+product.getProductPrice());
        System.out.println("\n");
    }
	
	public static void updateProduct() throws Exception{
        System.out.println("------------------------------------------------");
        System.out.println("Enter Product ID:");
        System.out.println("------------------------------------------------");
        int productId = Integer.parseInt(br.readLine());
        
        System.out.println("------------------------------------------------");
        System.out.println("Enter New Product Name:");
        System.out.println("------------------------------------------------");
        String productName = br.readLine();
        
        System.out.println("------------------------------------------------");
        System.out.println("Enter New Product Price:");
        System.out.println("------------------------------------------------");
        int productPrice = Integer.parseInt(br.readLine());
        
         
        Product product = new Product(productId, productName,productPrice);
        int status = dao.updateProduct(product);
        if(status ==1 )
        {
            System.out.println("Product updated successfully");
        }
        else
        {
            System.out.println("Opps some error occured");
        }
        System.out.println("\n");

    }
	
	public static void deleteProduct() throws Exception{
        System.out.println("------------------------------------------------");
        System.out.println("Enter Product ID:");
        System.out.println("------------------------------------------------");
        int productId = Integer.parseInt(br.readLine());
        int status = dao.deleteProduct(productId);
        if(status == 1 )
        {
            System.out.println("Product deleted successfully");
        }
        else
        {
            System.out.println("opps some error occured");
        }
        System.out.println("\n");

    }
	
	  public static void searchProduct() throws Exception
	    {
	        System.out.println("------------------------------------------------");
	        System.out.println("Enter Product ID:");
	        System.out.println("------------------------------------------------");
	        int productId = Integer.parseInt(br.readLine());
	        
	        List<Product> productList=dao.getProductByid(productId);
	        
	        for(Product product: productList)
	        {
	            //display product one by one
	            displayProduct(product);
	        }
	        System.out.println("-----------------------------------------------");
	        System.out.println("\n");
	    }

}
