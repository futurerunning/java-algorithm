package com.java.algorithm.examples;

public class MinHeapSort extends BaseSort {

	static public void main(String[] args) {

		new MinHeapSort().minHeapSort();
	}

	private void minHeapSort() {
		doMinHeapSort(array);
		printArray();
	}

	private void doMinHeapSort(int[] array) {
		int i;
		/*
		 * for (i = ((array.length - 1) - 1) / 2; i >= 0; i--) {// 构建一个大顶堆
		 * adjustHeap(array, i, array.length - 1); }
		 */

		for (i = (array.length / 2 - 1); i >= 0; i--) {// 构建一个大顶堆
			adjustHeap(array, i, array.length - 1);
		}

		// System.out.println(Arrays.toString(a));
		// System.exit(0);

		for (i = array.length - 1; i > 0; i--) {// 将堆顶记录和当前未经排序子序列的最后一个记录交换
			int temp = array[0];
			array[0] = array[i];
			array[i] = temp;
			adjustHeap(array, 0, i - 1);// 将a中前i-1个记录重新调整为大顶堆
		}
	}

	public static void adjustHeap(int[] a, int i, int len) {
		int temp;
		temp = a[i];// 最后一个节点的父节点
		for (int j = 2 * i + 1; j <= len; j = 2 * j + 1) {// 沿关键字较小的孩子结点向下筛选
			if (j + 1 <= len && a[j] > a[j + 1])
				++j; // j为关键字中较小记录的下标
			if (temp <= a[j])
				break;
			a[i] = a[j];
			i = j;
			a[i] = temp;
		}
	}

}
