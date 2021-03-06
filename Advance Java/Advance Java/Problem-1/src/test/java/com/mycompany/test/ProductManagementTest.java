package com.mycompany.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.mycompany.DAO.ProductManagementDAO;
import com.mycompany.domain.Product;

@ExtendWith(MockitoExtension.class)

class ProductManagementTest {
	
	@Mock
	ProductManagementDAO productDao;
	
	

	@Test
	void testGetAllProductFromDB() {
		//Fake Data
		Product prod1=new Product(1,"Mobile",7900);
		Product prod2=new Product(2,"fridge",17800);
		
		List<Product> listOfFakeProduct=new ArrayList<>();
		listOfFakeProduct.add(prod1);
		listOfFakeProduct.add(prod2);
		
		Mockito.when(productDao.getAllProducts()).thenReturn(listOfFakeProduct);
		
		List<Product> listProducts=productDao.getAllProducts();
		 
		assertEquals(2, listProducts.size());
	}
	
	@Test
	void testStoreProduct() {
		Product prod=new Product(1,"Body Spray",700);
		
		Mockito.when(productDao.addProduct(prod)).thenReturn(1);
		int result=productDao.addProduct(prod);
		
		assertEquals(1, result);
	}
	
	@Test
	void testDeleteProduct() {
		
		Product prod1=new Product(1,"Mobile",7900);
		Product prod2=new Product(2,"fridge",17800);
		
		List<Product> listOfFakeProduct=new ArrayList<>();
		listOfFakeProduct.add(prod1);
		listOfFakeProduct.add(prod2);
		
		Mockito.when(productDao.deleteProduct(1)).thenReturn(1);
		
		int result=productDao.deleteProduct(1);
		assertEquals(1, result);
	}
	
	@Test
	void testUpdateProduct() {
		Product prod1=new Product(1,"Ear Phone",2000);
		
		Mockito.when(productDao.updateProduct(prod1)).thenReturn(1);
		
		int result=productDao.updateProduct(prod1);
		assertEquals(1, result);
	}

}
