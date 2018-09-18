package com.java.algorithm.examples;

public class MergeSort extends BaseSort {

	static public void main(String[] args) {

		new MergeSort().mergeSort();

	}

	private void mergeSort() {
		int[] temp = new int[array.length];
		doMergeSort(array, 0, array.length - 1, temp);
		printArray();
	}

	private void doMergeSort(int[] array, int start, int end, int[] temp) {

		if (start == end)
			return;

		int _start = start;
		int _end = end;
		int mid = (_start + _end) / 2;

		doMergeSort(array, _start, mid, temp);
		doMergeSort(array, mid + 1, _end, temp);

		int tempIndex = 0;
		int _mid=mid+1;
		while (_start <= mid && _mid <= _end) {
			if (array[_start] <= array[_mid]) {
				temp[tempIndex++] = array[_start++];
			} else {
				temp[tempIndex++] = array[_mid++];
			}
		}

		while (_start <= mid)
			temp[tempIndex++] = array[_start++];

		while (_mid <= _end)
			temp[tempIndex++] = array[_mid++];

		tempIndex = 0;
		while (start <= end)
			array[start++] = temp[tempIndex++];

	}

}
