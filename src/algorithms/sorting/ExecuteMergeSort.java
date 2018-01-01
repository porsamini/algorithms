package algorithms.sorting;
import algorithms.sorting.core.*;
import algorithms.data.LongHeavyRandomArray;

public class ExecuteMergeSort {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		LongHeavyRandomArray longHeavyRandomArray = new LongHeavyRandomArray();
		int[] list = longHeavyRandomArray.getList();
		int p = 0, r = list.length-1;
		MergeSort mergeSort = new MergeSort();
		mergeSort.mergeSort(list, p, r);
		long stop = System.currentTimeMillis();
//		for(int i = 0; i < list.length; i++) {
//			System.out.println(list[i]);
//		}
		System.out.println("Execution Time for MergeSort: "+(stop - start)+" milliseconds");
	}
}
