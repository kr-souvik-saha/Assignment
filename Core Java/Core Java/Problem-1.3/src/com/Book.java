package com;

public class Book {
	private String bookName;
	private double bookPrice;
	
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public double getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}
	
	public Book(String bookName, double bookPrice)
	{
		this.bookName= bookName;
		this.bookPrice = bookPrice;
	}
	
	 public void display(){
	      System.out.println("Book Name: "+this.bookName);
	      System.out.println("Book Price: "+this.bookPrice);
	      
	   }
	
	

}
