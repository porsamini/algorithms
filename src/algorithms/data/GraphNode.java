package algorithms.data;
import java.util.List;
import java.util.ArrayList;

public class GraphNode {
	int distance;
	int value;
	boolean visited;
	List<GraphNode> nodes = new ArrayList<GraphNode>();

	public GraphNode(int value) {
		this.value = value;
	}

	public boolean getVisited() {
		return this.visited;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public int getValue() {
		return this.value;
	}

	public void setVisited(boolean tf) {
		this.visited = tf;
	}

	public void addNodes(GraphNode node) {
		this.nodes.add(node);
	}
}
