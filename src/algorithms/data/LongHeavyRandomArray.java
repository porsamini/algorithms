package algorithms.data;

// Avoid running this program. You may ghost your IDE or terminal
public class LongHeavyRandomArray {
	int size = 1000000;
	int[] list = new int[size];
	public int[] getList() {
	    for (int i=0; i<size; i++){
	        int n1 = (int)(Math.random()*(size-1) + 1);
	        int n2 = (int)(Math.random()*(size-1) - (size));
	        list[i] = n1+n2;
	    }
	    return list;
	}
}
