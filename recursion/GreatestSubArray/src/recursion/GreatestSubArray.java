package recursion;

public class GreatestSubArray {
	int[] A = {13, -3, -25, 20, -3, -16, -23, 18,
		20, -7, 12, -5, -22, 15, -4, 7};
	int gSum = -1000000, i, j;

	public int[] getA() {
		return this.A;
	}

	public void setI(int i) {
		this.i = i;
	}

	public void setJ(int j) {
		this.j = j;
	}

	public int getI() {
		return this.i;
	}

	public int getJ() {
		return this.j;
	}

	public int getGSum() {
		return this.gSum;
	}

	public int[] find(int start, int end) {
		int mid = (start + end)/2;
		if(start < end) {
			find(start, mid);
			find(mid+1, end);
			sumUp(start, end);
		}
		int[] returnGreatestSum = {this.getI(), this.getJ(), this.getGSum()};
		return returnGreatestSum;
	}

	public void sumUp(int i1, int j1) {
		if(i1 == j1) {
			this.gSum = this.getA()[i1];
			this.setI(i1);
			this.setJ(j1);
			return;
		}
		else{
		    int thisSum = this.getA()[i1] + this.getA()[j1];
		    if(this.gSum < thisSum) {
			    this.gSum = thisSum;
			    this.i = i1;
			    this.j = j1;
		    }
	    }
	}
}
