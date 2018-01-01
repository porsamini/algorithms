package algorithms.recursion;
import algorithms.recursion.core.GreatestSubArray;
import algorithms.data.LongLeanRandomArray;

public class ExecuteGreatestSubArray {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		LongLeanRandomArray longLeanRandomArray = new LongLeanRandomArray();
		int[] list = longLeanRandomArray.getList();
		GreatestSubArray gSubArray = new GreatestSubArray(list);
		int[] greatestSubArray = gSubArray.findGreatest(0, list.length - 1);
		for(int i: greatestSubArray) {
			System.out.println(i);
		}
		long stop = System.currentTimeMillis();
		System.out.println("Execution Time for finding the largest consecutive sub-array using recursion: "+(stop - start)+" milliseconds");
	}
}
