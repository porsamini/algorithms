/**
 *  Unused
 */
package algorithms.data;
import java.util.ArrayList;
import java.util.List;

import algorithms.graphs.core.BFSNode;

public class AdjacencyList {
	List<BFSNode> list = new ArrayList<BFSNode>();

	public List<BFSNode> getList() {
		int adjacencyListLengthLimit = 1000000;
		int internalLengthLimit = 3;
		int internalWeightLimit = adjacencyListLengthLimit;

		for(int i = 0; i < adjacencyListLengthLimit; i++) {
			list.add(new BFSNode(i));
		}

		for(int i = 0; i < adjacencyListLengthLimit; i++) {
			BFSNode externalNode = this.list.get(i);
			int randomLimit = random(internalLengthLimit);
			for(int j = 0; j < randomLimit; j++) {
				int value = random(internalWeightLimit);
				BFSNode internalNode = this.list.get(value);
				if(externalNode.getNodes().contains(internalNode) || value == i) { j--; }
				else { externalNode.addNodes(internalNode); }
			}
		}

		return list;
	}

	// Anything between 0 and limit
	public int random(int limit) {
		return (int)(Math.random()*(limit));
	}

}
