package algorithms.sorting;
import algorithms.sorting.core.heapsort.MaxHeap;
import algorithms.data.LongHeavyRandomArray;

public class ExecuteHeapSort {
	public static void main(String[] args) {
		int[] list = new LongHeavyRandomArray().getList();
		MaxHeap mh = new MaxHeap();
		for(int i = 0; i < list.length; i++)
			mh.add(list[i]);
		long start = System.currentTimeMillis();
		mh.heapsort();
		long stop = System.currentTimeMillis();
		System.out.println("Execution Time for HeapSort: "+(stop - start)+" milliseconds");
//		mh.showAll();
	}
}
