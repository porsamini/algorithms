package algorithms.data;
import algorithms.data.Node;

public abstract class GraphNode extends Node {
	boolean visited;

	public GraphNode(int value) {
		super(value);
	}

	public boolean getVisited() {
		return this.visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}
}
