package com;

public class ArrayPlay {

	public static void main(String[] args) {
		int array[]= {3,2,4,5,6,4,5,7,3,2,3,4,7,1,2,0,0,0};
		int max=0;
		int sum=0;
		
		for(int i=0;i<15;i++) {
			if(array[i]>max) {
				max=array[i];
			}
		}
		
		int min=max;
		
		for(int i=0;i<15;i++) {
			if(array[1]<min) {
				min=array[i];
			}
		}
		
		for(int i=0;i<15;i++) {
			sum=sum+array[i];
		}
		
		array[15]=max;
		array[16]=sum/15;
		array[17]=min;
		
		System.out.println("The updated array is :");
		
		for(int i=0;i<18;i++) {
			System.out.print(array[i]+" ");
		}

	}

}
