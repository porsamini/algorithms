package algorithms.recursion;
import algorithms.recursion.GreatestSubArray;
import algorithms.data.CustomArray;

public class ExecuteGreatestSubArray {
	public static void main(String[] args) {
		CustomArray customArray = new CustomArray();
		int[] list = customArray.getList();
		GreatestSubArray gSubArray = new GreatestSubArray(list);
		int[] greatestSubArray = gSubArray.findGreatest(0, list.length - 1);
		for(int i: greatestSubArray) {
			System.out.println(i);
		}
	}
}
