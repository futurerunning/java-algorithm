package com.java.algorithm.examples;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] array=new int[]{-1,6,2,3,11,20,80,4,5,2,9,3};
	    bubbleSort(array);
	    System.out.println(Arrays.toString(array));
	}

	static private void bubbleSort(int[] array) {
		
		for(int i=0;i<array.length-1;i++) {
			for(int j=0;j<array.length-i-1;j++) {
				
				if(array[j]>array[j+1]) {
					int temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
					
				}
				
			}
		}
		
	}
	
}
