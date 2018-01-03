package algorithms.graphs.core;
import java.util.Queue;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;
import java.util.NoSuchElementException;

// With a condition that a node doesn't point to itself
public class BFS {
	Queue<Integer> que = new LinkedList<Integer>();
	List<BFSNode> adjacencyList = new ArrayList<BFSNode>();
	int hop=0;

	public BFS(List<BFSNode> adjacencyList) {
		this.adjacencyList = adjacencyList;
	}

	public List<BFSNode> getAdjacencyList() {
		return this.adjacencyList;
	}

	public void traverse(int source) {
		List<BFSNode> childNodes = adjacencyList.get(source).getNodes();
		if(!childNodes.isEmpty()) {
			hop++;
		}
		for(BFSNode node: adjacencyList.get(source).getNodes()) {
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
