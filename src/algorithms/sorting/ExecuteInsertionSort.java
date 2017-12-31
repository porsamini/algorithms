package algorithms.sorting;

import algorithms.data.LongRandomArray;
import algorithms.sorting.core.InsertionSort;

public class ExecuteInsertionSort {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		LongRandomArray longRandomArray = new LongRandomArray();
		int[] list = longRandomArray.getList();
		InsertionSort insertionSort = new InsertionSort(list);
		list = insertionSort.sort();
		long stop = System.currentTimeMillis();
//		for(int i = 0; i < list.length; i++) {
//			System.out.println(list[i]);
//		}
		System.out.println("Execution Time for InsertionSort: "+(stop - start)+" milliseconds");
	}
}
