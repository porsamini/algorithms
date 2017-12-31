package algorithms.sorting.core;

public class SelectionSort {
	int[] list;
	public SelectionSort(int[] list) {
		this.list = list;
	}
	
	public int[] sort() {
		for(int i=0; i < list.length - 1; i++) { // n-1
			int smallestNum = list[i], smallestIndex = i; // n-2
			for(int j=i+1; j < list.length; j++) { // E(1 to n) t(i) 
				if(list[j] < smallestNum) { // E(1 to n) t(i)
					smallestIndex = j; // E(1 to n) t(i) - 1
					smallestNum = list[j]; // E(1 to n) t(i) - 1
				}
			}
			list[smallestIndex] = list[i]; // n-2
			list[i] = smallestNum; // n-2
		}
		return list;
	}
}
