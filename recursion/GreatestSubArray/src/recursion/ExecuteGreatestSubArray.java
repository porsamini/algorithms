package recursion;
import recursion.GreatestSubArray;

public class ExecuteGreatestSubArray {
	public static void main(String[] args) {
		GreatestSubArray gSubArray = new GreatestSubArray();
		int[] greatestSubArray = gSubArray.find(0, gSubArray.getA().length - 1);
		for(int i: greatestSubArray) {
			System.out.println(i);
		}
	}
}
