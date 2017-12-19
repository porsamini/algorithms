public class ReverseSort {
	public static void main(String[] args) {
		int[] A = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
		System.out.println("Sorted Array:");
		for(int i = 1; i < A.length; i++) {
			int key = A[i];
			int j = i - 1;
			while(j >= 0 && A[j] < key) {
				A[j+1] = A[j];
				j = j - 1;
			}
			A[j+1] = key;
		}
		for(int i: A) {
			System.out.println(i);
		}
	}
}
