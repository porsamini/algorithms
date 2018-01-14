package algorithms.sorting;
import algorithms.sorting.core.heapsort.MaxHeap;

public class ExecuteHeapSort {
	public static void main(String[] args) {
		int[] list = { 7, 4, 10, 1, 16, 6, 8, 2, 5, 3 };
		MaxHeap mh = new MaxHeap();
		for(int i = 0; i < list.length; i++)
			mh.add(list[i]);
		mh.showAll();
	}
}
