package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class NameArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String arr[]= {"Anil","Sunil","Raju"};
		ArrayList<String> names = new ArrayList<String>(Arrays.asList(arr));  
		
		System.out.println("Enter 1 to search name from the array,2 for add new name into the array : ");
		int res=sc.nextInt();
		
		if(res==1) {
			System.out.println("Enter the name to be searched : ");
			String name=sc.next();
			if(names.contains(name)) {
				System.out.println("The entered name is present in the array");
			}else {
				System.out.println("The entered name is not present in the array");
				}
			}
		else if(res==2) {
			System.out.println("Enter the name to be Added : ");
			String name=sc.next();
			
			names.add(name); 
		}

	}

}
