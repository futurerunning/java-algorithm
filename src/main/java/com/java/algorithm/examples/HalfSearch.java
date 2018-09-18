package com.java.algorithm.examples;

public class HalfSearch {

	static public void main(String[] args)
	{
	
		int[] array=new int[] {0,8,12,15,19,21,33};
	    System.out.println(halfSearch(array,19));
	}
	
	static private int halfSearch(final int[] array,final int key) {
		int start=0;
		int end=array.length-1;
		int index=-1;
		while(start<=end) {
			
			int mid=((start+end)/2);
			if(array[mid]==key)
				return index= mid;
			
			if(array[mid]>key) {
				end=mid;
			}else {
				start=mid;
			}
			
			
		}
		
		return index;
	}
	
	
}
