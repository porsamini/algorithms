package algorithms.data;

public abstract class GraphNode {
	int value;
	boolean visited;

	public GraphNode(int value) {
		this.value = value;
	}

	public boolean getVisited() {
		return this.visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public int getValue() {
		return this.value;
	}
}
