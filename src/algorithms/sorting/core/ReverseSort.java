package algorithms.sorting.core;

public class ReverseSort {
	int[] list;
	public ReverseSort(int[] list) {
		this.list = list;
	}
	
	public int[] sort() {
		for(int i = 1; i < list.length; i++) {
			int key = list[i];
			int j = i - 1;
			while(j >= 0 && list[j] < key) {
				list[j+1] = list[j];
				j = j - 1;
			}
			list[j+1] = key;
		}
		return list;
	}
}
