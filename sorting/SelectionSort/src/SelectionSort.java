public class SelectionSort {
	public static void main(String[] args) {
		int[] A = {8, 6, 1, 5, 3, 0, 2, 3};
		System.out.println("Sorted Array:");
		for(int i=0; i < A.length - 1; i++) { // n-1
			int smallestNum = A[i], smallestIndex = i; // n-2
			for(int j=i+1; j < A.length; j++) { // E(1 to n) t(i) 
				if(A[j] < smallestNum) { // E(1 to n) t(i)
					smallestIndex = j; // E(1 to n) t(i) - 1
					smallestNum = A[j]; // E(1 to n) t(i) - 1
				}
			}
			A[smallestIndex] = A[i]; // n-2
			A[i] = smallestNum; // n-2
			System.out.println(A[i]);
		}
		System.out.println(A[A.length - 1]);
	}
} 
