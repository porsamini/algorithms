package algorithms.sorting.core.heapsort;

import algorithms.data.Node;
import java.util.ArrayList;
import java.util.List;

public class MaxHeap {
	List<Node> nodes = new ArrayList<Node>();
	int size = 0;

	public void add(int item) {
		Node node = new Node(item);
		nodes.add(0, node);
		this.size++;
		this.heapify(0);
	}

	public List<Node> get(){
		return this.nodes;
	}

	public void showAll(){
		for(Node node: nodes) {
			System.out.println(node.getValue());
		}
	}

	public void heapsort() {
		for(int i = nodes.size() - 1; i >= 1; i--) {
			swapNodes(0, i);
			size--;
			heapify(0);
		}
	}

	private void heapify(int index) {
		int lChild = index * 2 + 1;
		int rChild = index * 2 + 2;
		int largest = index;

		if(this.size > lChild && nodeValue(lChild) > nodeValue(largest)) {
			largest = lChild;
		}

		if(this.size > rChild && nodeValue(rChild) > nodeValue(largest)) {
			largest = rChild;
		}

		if(largest != index) {
			swapNodes(largest, index);
			heapify(largest);
		}
	}

	private int nodeValue(int childIndex) {
		return this.nodes.get(childIndex).getValue();
	}

	private void swapNodes(int a, int b) {
		Node temp = this.nodes.get(a);
		this.nodes.set(a, this.nodes.get(b));
		this.nodes.set(b, temp);
	}
}
