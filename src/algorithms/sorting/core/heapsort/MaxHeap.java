package algorithms.sorting.core.heapsort;

import algorithms.data.Node;
import java.util.ArrayList;
import java.util.List;

public class MaxHeap {
	List<Node> nodes = new ArrayList<Node>();
	public void build(int[] list) {
		build(nodes, 0);
//		for(int i = 0; i < list.length; i++) {
//			Node node = new Node(list[i]);
//			nodes.add(i, node);
			
			// parent: i/2
			// lChild: 2i
			// rChild: 2i+1
//		}
	}
	
	public void build(List<Node> subHeap, int index) {
		if(index == 0) {
			this.nodes.add(index, subHeap.get(index));
		}
		else {
			int parent = index/2;
			int greatest;
			if(subHeap.get(parent).getValue() > subHeap.get(index).getValue()) {
				greatest = parent;
			}
			int lChild = index * 2;
			int rChild = (index * 2) + 1;
		}
	}
	
	public List<Node> get(){
		return this.nodes;
	}
}
