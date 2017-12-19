class MergeSort{
	public void mergeSort(int[] A, int p, int r) {
		if(p < r) {
			int q = (p+r)/2;
			mergeSort(A, p, q);
			mergeSort(A, q+1, r);
			merge(A, p, q, r);
		}
	}
	
	public void merge(int[] A, int p, int q, int r) {
		int lLength = q - p + 1;
		int rLength = r - q;
		int i,j;
		int[] L = new int[lLength];
		int[] R = new int[rLength];
		for(i = 0; i < lLength; i++) {
			L[i] = A[p + i];
		}
		for(j = 0; j < rLength; j++) {
			R[j] = A[q + 1 + j];
		}
		i = j = 0;
		while(i < lLength && j < rLength) {
			if(L[i] < R[j]) {
				A[p+i+j] = L[i];
				i++;
			}
			else {
				A[p+i+j] = R[j];
				j++;
			}
		}
		while(i < lLength) {
			A[p+i+j] = L[i];
			i++;
		}
		while(j < rLength) {
			A[p+i+j] = R[j];
			j++;
		}
	}
}

public class ExecuteMergeSort {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		int[] A = {9, 1, 5, 4, 2, 0, 11, 3, 12, 8, 
				100, 13, 11, 557, 31, 26, 566, 
				777, 73, 734, 23, 2, 55, 512, 63, 
				66, 12, 55, 63, 61, 53};
		int p = 0, r = A.length-1;
		MergeSort mergeSort = new MergeSort();
		mergeSort.mergeSort(A, p, r);
		System.out.println("Execution Time: "+(System.currentTimeMillis() - start));
		for(int i = 0; i < A.length; i++) {
			System.out.println(A[i]);
		}
	}
}
