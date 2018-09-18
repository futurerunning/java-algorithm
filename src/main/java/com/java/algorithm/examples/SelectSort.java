package com.java.algorithm.examples;

public class SelectSort extends BaseSort {

	static public void main(String[] args) {
		new SelectSort().selectSort();
	}
	
	private void selectSort() {
		doSelectSort(array);
	    printArray();
	}
	
	private void doSelectSort(int[] array) {
		
		for(int i=0;i<array.length-1;i++)
		{
			int k=i;
			for(int j=i;j<array.length;j++) {
				if(array[j]<array[k])
					k=j;
			}
			
			if(i!=k) {
				int temp=array[i];
				array[i]=array[k];
				array[k]=temp;
			}
		}
		
	}
}
