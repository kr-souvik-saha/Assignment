package com;

import java.util.Scanner;

public class StringInfo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String rev="";
		
		System.out.println("Enter the string : ");
		String str=sc.nextLine();
		
		System.out.println("The length of the entered string is "+str.length());
		System.out.println("The entered string in upper case is "+str.toUpperCase());
		
		for (int i=str.length()-1;i>=0;i--) {
			rev = rev + str.charAt(i);
		}
		if(str.equals(rev)) {
			System.out.println("The entered string is palindrom");
		}else {
			System.out.println("The entered string is not palindrom");
		}

	}

}
