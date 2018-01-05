package algorithms.graphs.core;
import java.util.Queue;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;
import algorithms.data.GraphNode;

// With a condition that a node doesn't point to itself
public class BFS {
	Queue<Integer> que = new LinkedList<Integer>();
	int hop=0;
	List<GraphNode> adjacencyList;

	public BFS(List<GraphNode> adjacencyList) {
		this.adjacencyList = adjacencyList;
	}

	public List<GraphNode> getAdjacencyList(){
		return this.adjacencyList;
	}

	public void traverse(int source) {
		GraphNode sourceNode = this.adjacencyList.get(source);

		List<GraphNode> childNodes = sourceNode.getNodes();
		if(!childNodes.isEmpty()) {
			hop++;
		}
		for(GraphNode node: childNodes) {
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
