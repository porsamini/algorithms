package algorithms.graphs.core;
import java.util.Queue;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;
import algorithms.data.BFSNode;

// With a condition that a node doesn't point to itself
public class BFS {
	Queue<Integer> que = new LinkedList<Integer>();
	int hop=0;
	List<BFSNode> adjacencyList;

	public BFS(List<BFSNode> adjacencyList) {
		this.adjacencyList = adjacencyList;
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
