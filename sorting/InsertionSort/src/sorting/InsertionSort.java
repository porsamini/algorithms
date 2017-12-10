package sorting;

public class InsertionSort {
	public static void main(String[] args) {
		int[] sample = {8, 6, 1, 5, 3, 0, 2, 3};
		for (int j=1; j<sample.length; j++) {
			int key = sample[j];
			int i = j - 1;
			while( i >= 0 && sample[i] > key ) {
				sample[i+1] = sample[i];
				i = i - 1;
			}
			sample[i+1] = key;
		}
		for(int i = 0; i < sample.length; i++) {
			System.out.println(sample[i]);
		}
	}
}
