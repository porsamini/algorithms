package algorithms.sorting;

import algorithms.data.LongRandomArray;
import algorithms.sorting.core.SelectionSort;

public class ExecuteSelectionSort {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		LongRandomArray longRandomArray = new LongRandomArray();
		int[] list = longRandomArray.getList();
		SelectionSort selectionSort = new SelectionSort(list);
		list = selectionSort.sort();
		long stop = System.currentTimeMillis();
//		for(int i = 0; i < list.length; i++) {
//			System.out.println(list[i]);
//		}
		System.out.println("Execution Time for SelectionSort: "+(stop - start)+" milliseconds");
	}
} 
