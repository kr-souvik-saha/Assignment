package com;

public class Reperting {
	static String findReperting(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					return "The first Repeting element is "+arr[i];
				}
			}	
		}
		return "No number is repeting";
	}

	public static void main(String[] args) {
		int arr[]= {1,2,3,10,5,4,5,7,8};
		System.out.println(findReperting(arr));
	}

}
