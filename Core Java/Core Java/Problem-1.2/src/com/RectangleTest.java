package com;

import java.util.Scanner;

public class RectangleTest {
	
	public static int length;
	public static int breadth;
	public static int area;
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//1st object
		RectangleTest tr1= new RectangleTest();
		System.out.println("enter length for rectangle 1: ");
		tr1.length=sc.nextInt();
		System.out.println("enter breadth for rectangle 1: ");
		tr1.breadth=sc.nextInt();
		tr1.area= length * breadth;
		System.out.println("area of rectangle 1: "+ tr1.area);
		
		
		
		//2nd object
		RectangleTest tr2= new RectangleTest();	
		System.out.println("enter length for rectangle 2: ");
		tr2.length=sc.nextInt();
		System.out.println("enter breadth for rectangle 2: ");
		tr2.breadth=sc.nextInt();
		tr2.area= length * breadth;
		System.out.println("area of rectangle 2: "+ tr2.area);
		
		
		//3rd object
		RectangleTest tr3= new RectangleTest();
		System.out.println("enter length for rectangle 3: ");
		tr3.length=sc.nextInt();
		System.out.println("enter breadth for rectangle 3: ");
		tr3.breadth=sc.nextInt();
		tr3.area= length * breadth;
		System.out.println("area of rectangle 3: "+ tr3.area);
		
		//4th object
		RectangleTest tr4= new RectangleTest();
		System.out.println("enter length and for rectangle 4: ");
		tr4.length=sc.nextInt();
		System.out.println("enter breadth for rectangle 4: ");
		tr4.breadth=sc.nextInt();
		tr4.area= length * breadth;
		System.out.println("area of rectangle 4: "+ tr4.area);
		
		//5th object
		RectangleTest tr5= new RectangleTest();
		System.out.println("enter length and for rectangle 5: ");
		tr5.length=sc.nextInt();
		System.out.println("enter breadth for rectangle 5: ");
		tr5.breadth=sc.nextInt();
		tr5.area= length * breadth;
		System.out.println("area of rectangle 5: "+ tr5.area);
	}

}
