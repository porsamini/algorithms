package algorithms.sorting;

import algorithms.data.LongHeavyRandomArray;
import algorithms.sorting.core.ReverseSort;

public class ExecuteReverseSort {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		LongHeavyRandomArray longHeavyRandomArray = new LongHeavyRandomArray();
		int[] list = longHeavyRandomArray.getList();
		ReverseSort reverseSort = new ReverseSort(list);
		list = reverseSort.sort();
		long stop = System.currentTimeMillis();
//		for(int i = 0; i < list.length; i++) {
//			System.out.println(list[i]);
//		}
		System.out.println("Execution Time for ReverseSort: "+(stop - start)+ " milliseconds");
	}
}
