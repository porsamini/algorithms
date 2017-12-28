package recursion;

public class GreatestSubArray {
	int[] A = {13, -3, -25, 20, -3, -16, -23, 18,
		20, -7, 12, -5, -22, 15, -4, 7};
	int gSum, i, j;

	public int[] getA() {
		return this.A;
	}

	public void find(int start, int end) {
		int mid = (start + end)/2;
		if(end > start) {
			find(start, mid);
			sumUp(start, mid);
			find(mid+1, end);
			sumUp(mid+1, end);
		}
	}

	public void sumUp(int i1, int j1) {
		int thisSum = A[i1] + A[j1];
		if(this.gSum < thisSum) {
			this.gSum = thisSum;
			this.i = i1;
			this.j = j1;
		}
	}
}
