package algorithms.sorting.core;

public class InsertionSort {
	int[] list;
	public InsertionSort(int[] list){
		this.list = list;
	}
	public int[] sort() {
		for (int j=1; j<list.length; j++) {
			int key = list[j];
			int i = j - 1;
			while( i >= 0 && list[i] > key ) {
				list[i+1] = list[i];
				i = i - 1;
			}
			list[i+1] = key;
		}
		return list;
	}
}
