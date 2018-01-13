package algorithms.sorting.core.heapsort;

import algorithms.data.Node;
import java.util.LinkedList;
//import java.util.List;

//6 -1 1 7 0 -6 -2 3 -9 4
// 6(0), 1(1), -1(2),
public class MaxHeap {
	LinkedList<Node> nodes = new LinkedList<Node>();
	public void heapify(int[] list, int index) {
		Node node = new Node(list[index]);
		int largest = index;
		if(nodes.size() == 0) {
			nodes.add(node);
		}
//		else {
//			int lChild = index * 2; // 0
//			int rChild = index * 2 + 1; // 1
//			int parent = index / 2;	// 0
//			try {
//				if(nodes.get(index).getValue() < list[parent]) {
//					largest = parent;
//				}
//				else if(nodes.get(index).getValue() < list[rChild]) {
//					largest = rChild;
//				}
//				else {
//					largest = lChild;
//				}
//			}
//			catch(IndexOutOfBoundsException ex) {
//				System.out.println("Out of bounds");
//			}
//		}
		nodes.add(largest+1, node);
//		heapify(list, largest); // 0
	}
	public LinkedList<Node> get(){
		return this.nodes;
	}
}
