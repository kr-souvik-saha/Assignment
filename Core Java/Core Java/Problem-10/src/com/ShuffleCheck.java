package com;

import java.util.Scanner;

public class ShuffleCheck {
	static void check(String str1,String str2,String result) {
		 String str3 = str1 + str2;
	        StringBuffer s = new StringBuffer(str3);

	        boolean flag = false;

	        char[] ch = result.toCharArray();

	        if (s.length() != result.length()) {
	            flag = false;
	        } else {

	            for (int i = 0; i < ch.length; i++) {
	                
	                String temp = Character.toString(ch[i]);

	                if (str3.contains(temp)) {

	                    s = s.deleteCharAt(s.indexOf(temp));
	                    str3 = new String(s);
	                    flag = true;
	                    
	                } else {
	                    flag = false;
	                    break;
	                }

	            }

	        }

	        if (flag) {
	            System.out.println("true : third string is valid shuffle of first and second string");
	        } else {
	            System.out.println("false : third string is NOT valid shuffle of first and second string");
	        }

	    }

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter string 1 : ");
		String str1=sc.next();
		
		System.out.println("Enter string 2 : ");
		String str2=sc.next();
		
		System.out.println("Enter the shuffled string :");
		String str3=sc.next();
		
		check(str1,str2,str3);

	}

}
