package com.java.algorithm.examples;

public class QuickSort extends BaseSort {

	static public void main(String[] args) {

		new QuickSort().quickSort();
	}

	private void quickSort() {
		doQuickSort(array, 0, array.length - 1);
		printArray();
	}

	private void doQuickSort(int[] array, int start, int end) {

		int _start = start;
		int _end = end;
		int key = array[_start];
		while (_start < _end) {
			while (_start < _end && array[_end] >= key) {

				_end--;

			}

			if (array[_end] <= key) {

				int temp = array[_start];
				array[_start] = array[_end];
				array[_end] = temp;
			}

			while (_start < _end && array[_start] <= key) {

				_start++;

			}

			if (array[_start] >= key) {
				int temp = array[_end];
				array[_end] = array[_start];
				array[_start] = temp;

			}
		}
		if (_start > start)
			doQuickSort(array, start, _start - 1);
		if (_end < end)
			doQuickSort(array, _end + 1, end);
	}

}
