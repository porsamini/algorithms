package search;

// Initialization: Initialize the index to 0 assuming the item will never be found
// and make sure the index is less than the length of the item array
//
// Maintenance: Increment i by 1 since the item was not found
//
// Termination: The loop has either scanned through all the elements in the array
// or the element was found before the loop ran through all the items in the array,
// yielding the value of the index at which the element was found

public class LinearSearch {
    public static void main(String[] args) {
        int[] items = { 1, 2, 3, 4, 5, 6, 7 };
        int search = 1, i = 0;
        while(i < items.length && items[i] != search)
            i++;
        if(i == items.length) {
            System.out.println("Cannot be found");
        }
        else{
            System.out.println("Found at: "+i);
        }
    }
}