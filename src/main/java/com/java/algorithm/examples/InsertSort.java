package com.java.algorithm.examples;

public class InsertSort extends BaseSort {

	static public void main(String[] args) {
		new InsertSort().insertSort();
	}

	private void insertSort() {
		doInsertSort(array);
		printArray();
	}

	private void doInsertSort(int[] array) {

		for (int i = 0; i < array.length; i++) {

			if (i == 0)
				continue;

			int j = i;
			int key = array[j];
			while (j > 0 && array[j - 1] > key) {
				array[j] = array[j - 1];
				j--;
			}

			array[j]=key;
		}

	}

}
