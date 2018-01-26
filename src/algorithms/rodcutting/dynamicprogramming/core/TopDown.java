package algorithms.rodcutting.dynamicprogramming.core;

public class TopDown {
	int[] price = {0, 1, 5, 8, 9, 10, 17, 17, 20, 24, 30, 32, 34, 36,
			39, 43, 44, 44, 44, 44, 46, 46, 46, 46, 48, 48, 48,
			48, 48, 48, 48, 48, 48, 54};
	int q = -11111;

	public int cutRodTopDown(int n) {
		int[] r = new int[n+1];
		r[0] = -11111;
		for(int i = 1; i <= n; i++) {
			r[i] = -11111;
		}
		return cutRod(n, r);
	}

	public int cutRod(int n, int[] r) {
		if(n == 0) {
			return 0;
		}
		if(r[n] >= 0) {
			return r[n];
		}
		for(int i = 1; i <= n; i++) {
			q = max(q, price[i] + cutRod(n - i, r));
		}
		r[n] = q;
		return q;
	}

	private int max(int a, int b) {
		return (a > b) ? a : b;
	}
}
