package algorithms.rodcutting.bruteforce;
import algorithms.rodcutting.bruteforce.core.BruteForce;

public class ExecuteBruteForce {
	public static void main(String[] args) {
		BruteForce bf = new BruteForce();
		long start = System.currentTimeMillis();
		System.out.println(bf.cutRod(31));
		long stop = System.currentTimeMillis();
		System.out.println("Execution Time for rod-cutting using bruteforce is: "+(stop - start)+" milliseconds");
	}
}
