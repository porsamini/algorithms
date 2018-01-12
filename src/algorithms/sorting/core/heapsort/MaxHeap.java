package algorithms.sorting.core.heapsort;

import algorithms.data.Node;
import java.util.ArrayList;
import java.util.List;

public class MaxHeap {
	List<Node> nodes = new ArrayList<Node>();
	public void heapify(int[] list, int index) {
		Node node = new Node(list[index]);
		int largest;
		if(index == 0) {
			nodes.add(node);
		}
		else {
			if(nodes.get(index).getValue() > list[index]) {
				largest = index;
			}
		}
	}
//			if(subHeap.get(parent).getValue() > subHeap.get(index).getValue()) {
//				largest = parent;
//			}
	public List<Node> get(){
		return this.nodes;
	}
}
