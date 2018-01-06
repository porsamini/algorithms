package algorithms.graphs.core;

import java.util.ArrayList;
import java.util.List;

import algorithms.data.DFSNode;

public class DFS extends Graph {

	List<DFSNode> adjacencyList = new ArrayList<DFSNode>();
	int hop;

	public DFS() {
		setAdjacencyList();
		this.hop = 1;
	}

	public void setAdjacencyList() {
		for(int i = 0; i < adjacencyListLengthLimit; i++) {
			adjacencyList.add(new DFSNode(i));
		}

		for(int i = 0; i < adjacencyListLengthLimit; i++) {
			DFSNode externalNode = this.getAdjacencyList().get(i);
			int randomLimit = random(internalLengthLimit);
			for(int j = 0; j < randomLimit; j++) {
				int value = this.random(internalWeightLimit);
				DFSNode internalNode = this.adjacencyList.get(value);
				if(externalNode.getNodes().contains(internalNode) || value == i) { j--; }
				else { externalNode.addNodes(internalNode); }
			}
		}
	}

	public List<DFSNode> getAdjacencyList(){
		return this.adjacencyList;
	}

	public void traverse(DFSNode sourceNode) {
		if(!sourceNode.getVisited()) {
			sourceNode.setVisited(true);
			sourceNode = this.getAdjacencyList().get(sourceNode.getValue());
			sourceNode.setEntry(hop++);
			List<DFSNode> childNodes = sourceNode.getNodes();
			for(DFSNode childNode: childNodes) {
				traverse(childNode);
			}
			sourceNode.setExit(hop++);
		}
	}
}
