package algorithms.graphs.core;
import java.util.Queue;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;
import algorithms.data.BFSNode;

// With a condition that a node doesn't point to itself
public class BFS extends Graph {
	Queue<Integer> que = new LinkedList<Integer>();
	int hop=0;
	List<BFSNode> adjacencyList = new ArrayList<BFSNode>();

	public BFS() {
		setAdjacencyList();
	}
	
	public void setAdjacencyList() {
		for(int i = 0; i < adjacencyListLengthLimit; i++) {
			adjacencyList.add(new BFSNode(i));
		}

		for(int i = 0; i < adjacencyListLengthLimit; i++) {
			BFSNode externalNode = this.getAdjacencyList().get(i);
			int randomLimit = random(internalLengthLimit);
			for(int j = 0; j < randomLimit; j++) {
				int value = this.random(internalWeightLimit);
				BFSNode internalNode = this.adjacencyList.get(value);
				if(externalNode.getNodes().contains(internalNode) || value == i) { j--; }
				else { externalNode.addNodes(internalNode); }
			}
		}
	}

	public List<BFSNode> getAdjacencyList(){
		return this.adjacencyList;
	}

	public void traverse(int source) {
		BFSNode sourceNode = this.adjacencyList.get(source);

		List<BFSNode> childNodes = sourceNode.getNodes();
		if(!childNodes.isEmpty()) {
			hop++;
		}
		for(BFSNode node: childNodes) {
			if(!(node.getVisited())) {
				que.add(node.getValue());
				node.setVisited(true);
				node.setDistance(hop);
			}
		}

		try {
			int u = que.remove();
			traverse(u);
		}
		catch(NoSuchElementException ex) {}
	}
}
