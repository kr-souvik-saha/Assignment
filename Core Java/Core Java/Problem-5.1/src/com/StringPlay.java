package com;

public class StringPlay {

	public static void main(String[] args) {
		String str="JAVA is Simple";
		String strArr[]=str.split(" ");
		
		System.out.println("The string in upper case is : "+str.toUpperCase());
		System.out.println("The String in lower case is : "+str.toLowerCase());
		System.out.println("The length of the given string is : "+str.length());
		
		System.out.print("The first alphabt of every word is : ");
		
		for(int i=0;i<strArr.length;i++) {
			System.out.print(strArr[i].charAt(0)+" ");
		}
		System.out.println();
		
		System.out.println("The string in reverse is : ");
		for(int i=strArr.length;i>0;i--) {
			System.out.println("Ho");
			System.out.print(strArr[i-1]+" ");
		}
		

	}

}
