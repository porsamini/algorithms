package algorithms.greatestsubarray.core.recursive;

public class GreatestSubArray {
	int[] list;
	public GreatestSubArray(int[] list){
		this.list = list;
	}
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
			sum += list[i];
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
			sum += list[i];
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
			response = new int[]{list[i1], i1, j1};
		}
		else{
			int sum = 0, minSum = -111111;
			for(int i = i1; i <= j1; i++) {
				sum += list[i];
				if(sum > minSum) {
					minSum = sum;
					response = new int[]{minSum, i1, i};
				}
			}
	    }
		return response;
	}
}
