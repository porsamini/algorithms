package recursion;

public class GreatestSubArray {
	int[] A = {13, 3, 25, 20, -3, -16, -23, 18,
		20, -7, 12, -5, -22, 15, -4, 7};
	int[] greatestMatrix = {-1000000, -1, -1};
	
	public int[] findGreatest(int start, int end) {
		int mid = (start + end)/2;
		if(start < end) {
			findGreatest(start, mid);
			int[] leftMatrix = sumUp(start, mid);
			findGreatest(mid+1, end);
			int[] rightMatrix = sumUp(mid+1, end);
			int[] midMatrix = findCrossOverGreatest(start, mid, end);
			if(leftMatrix[0] >= rightMatrix[0] && leftMatrix[0] >= midMatrix[0])
				greatestMatrix = leftMatrix;
			else if(rightMatrix[0] >= leftMatrix[0] && rightMatrix[0] >= midMatrix[0])
				greatestMatrix = rightMatrix;
			else {
				greatestMatrix = midMatrix;
			}
		}
		return greatestMatrix;
	}
	
	public int[] findCrossOverGreatest(int i1, int j1, int k1) {
		int leftSum = -1111111;
		int sum = 0;
		int i = j1;
		int minLeft = -1, maxRight = -1;
		while(i >= i1) {
			sum += A[i];
			if(sum > leftSum) {
				leftSum = sum;
				minLeft = i;
			}
			i--;
		}
		int rightSum = -1111111;
		i = j1+1;
		sum = 0;
		while(i <= k1) {
			sum += A[i];
			if(sum > rightSum) {
				rightSum = sum;
				maxRight = i;
			}
			i++;
		}
		
		int[] response = {(leftSum+rightSum), minLeft, maxRight};
		return response;
	}

	public int[] sumUp(int i1, int j1) {
		int[] response = {};
		if(i1 == j1) {
			response = new int[]{A[i1], i1, j1};
		}
		else{
			int sum = 0, minSum = -111111;
			for(int i = i1; i <= j1; i++) {
				sum += A[i];
				if(sum > minSum) {
					minSum = sum;
					response = new int[]{minSum, i1, i};
				}
			}
	    }
		return response;
	}
}
