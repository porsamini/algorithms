package algorithms.rodcutting.dynamicprogramming;
import algorithms.rodcutting.dynamicprogramming.core.TopDown;

public class ExecuteTopDown {
	public static void main(String[] args) {
		TopDown td = new TopDown();
		long start = System.currentTimeMillis();
		System.out.println(td.cutRodTopDown(30));
		long stop = System.currentTimeMillis();
		System.out.println("Execution Time for rod-cutting using dynamic programming is: "+(stop - start)+" milliseconds");
	}
}
