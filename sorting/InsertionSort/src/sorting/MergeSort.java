package sorting;

public class MergeSort {

	public static void main(String[] args) {
		int[] A = {9, 1, 5, 3, 11, 16, 2}; // {1, 3, 5, 9, 2, 11, 16};
//		System.out.println("p r");
		mergeSort(A, 0, A.length - 1);
	}
	
	public static void mergeSort(int[] A, int p, int r) {
//		System.out.println(p+" "+r);
		if(p < r){
			int q = (p+r)/2;
//			System.out.println("At p");
			mergeSort(A, p, q);
//			System.out.println("At q");
			mergeSort(A, q+1, r);
			merge(A, p, q, r);
		}
	}
	
	public static void merge(int[] A, int p, int q, int r) {
		System.out.println("merging..");
		System.out.println(q);
		System.out.println(p+" "+r);
		int[] L = new int[q-p+1];
		int[] R = new int[r-q];
		for(int i = p; i <= q; i++) {
			L[i] = A[i];
		}
		for(int i = q+1; i < r; i++) {
			R[i] = A[i];
		}
//		for(int i = q+1; i < r; i++) {
//			System.out.println(R[i]);
//		}
		int i = 0, j = 0;
		while(i <= q && j <= r) {
			if(L[i] < R[j]) {
				A[p+i] = L[i];
				i++;
			}
			else {
				A[q+1+i] = R[i];
				j++;
			}
		}
		while(i <= q){
			A[p+i] = L[i];
			i++;
		}

		while(j <= r){
			A[q+1+j] = R[j];
			j++;
		}
	}
}
