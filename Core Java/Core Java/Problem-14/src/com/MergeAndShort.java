package com;

import java.util.Arrays;

public class MergeAndShort {
	
	static void process(int arr1[],int arr2[]) {
		int len1=arr1.length;
		int len2=arr2.length;
		
		int len3=len1+len2;
		int[] result = new int[len3];
		
		System.arraycopy(arr1, 0, result, 0, len1);  
		System.arraycopy(arr2, 0, result, len1,len2); 
		
		Arrays.sort(result);
		System.out.println(Arrays.toString(result));
		
	}

	public static void main(String[] args) {
		int arr1[]= {8,5,1,3};
		int arr2[]= {7,9,2};
		
		process(arr1,arr2);
		
		
	}

}
