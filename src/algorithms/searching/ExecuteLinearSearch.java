package algorithms.searching;

import algorithms.searching.core.LinearSearch;
import algorithms.data.LongRandomArray;

// Initialization: Initialize the index to 0 assuming the item will never be found
// and make sure the index is less than the length of the item array
//
// Maintenance: Increment i by 1 since the item was not found
//
// Termination: The loop has either scanned through all the elements in the array
// or the element was found before the loop ran through all the items in the array,
// yielding the value of the index at which the element was found

public class ExecuteLinearSearch {
    public static void main(String[] args) {
		long start = System.currentTimeMillis();
		LongRandomArray longRandomArray = new LongRandomArray();
		int[] list = longRandomArray.getList();
        int search = list[999999];
        LinearSearch linearSearch = new LinearSearch();
        int index = linearSearch.search(list, search);
        if(index == -1) {
            System.out.println("Cannot be found");
        }
        else{
            System.out.println("Found at: "+index);
        }
		long stop = System.currentTimeMillis();
        System.out.println("Execution Time for LinearSearch: "+(stop - start)+" milliseconds");

    }
}