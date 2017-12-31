package algorithms.sorting.core;

public class MergeSort{
	public void mergeSort(int[] list, int p, int r) {
		if(p < r) {
			int q = (p+r)/2;
			mergeSort(list, p, q);
			mergeSort(list, q+1, r);
			merge(list, p, q, r);
		}
	}
	
	public void merge(int[] list, int p, int q, int r) {
		int lLength = q - p + 1;
		int rLength = r - q;
		int i,j;
		int[] L = new int[lLength];
		int[] R = new int[rLength];
		for(i = 0; i < lLength; i++) {
			L[i] = list[p + i];
		}
		for(j = 0; j < rLength; j++) {
			R[j] = list[q + 1 + j];
		}
		i = j = 0;
		while(i < lLength && j < rLength) {
			if(L[i] < R[j]) {
				list[p+i+j] = L[i];
				i++;
			}
			else {
				list[p+i+j] = R[j];
				j++;
			}
		}
		while(i < lLength) {
			list[p+i+j] = L[i];
			i++;
		}
		while(j < rLength) {
			list[p+i+j] = R[j];
			j++;
		}
	}
}
