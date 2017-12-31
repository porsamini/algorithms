package algorithms.searching.linearsearch;

public class LinearSearch {
	public int search(int[] list, int search) {
		int i = 0, pos = -1;
	    while(i < list.length && list[i] != search) {
	        i++;
	        if (list[i] == search){
	        		pos = i;
	        }
	    }
	    return pos;
	}
}
