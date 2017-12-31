package algorithms.data;

// Avoid running this program. You may ghost your IDE or terminal
public class LongRandomArray {
	int size = 1000000;
	int[] list = new int[size];
	public int[] getList() {
	    for (int i=0; i<size; i++){
	        int n = (int)(Math.random()*(size-1) + 1);
	        list[i] = n;
	    }
	    return list;
	}
}
