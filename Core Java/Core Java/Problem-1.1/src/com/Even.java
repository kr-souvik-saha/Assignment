package com;

import java.util.Scanner;

public class Even {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number upto which you want the output: ");
		
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			if(i%2==0) {
				System.out.print(i+" ");
			}
		}

	}

}
