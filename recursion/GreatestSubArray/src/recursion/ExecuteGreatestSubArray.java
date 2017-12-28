package recursion;
import recursion.GreatestSubArray;

public class ExecuteGreatestSubArray {
	public static void main(String[] args) {
		GreatestSubArray gSubArray = new GreatestSubArray();
		gSubArray.find(0, gSubArray.getA().length);
	}
}
