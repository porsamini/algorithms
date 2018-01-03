package algorithms.graphs.core;
import java.util.List;
import java.util.ArrayList;

public class BFSNode {
	int distance;
	int value;
	boolean visited;
	List<BFSNode> nodes = new ArrayList<BFSNode>();

	public BFSNode(int value) {
		this.value = value;
	}

	public boolean getVisited() {
		return this.visited;
	}

	public void setDistance(int dist) {
		this.distance = dist;
	}

	public int getDistance() {
		return this.distance;
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

	public void addNodes(BFSNode node) {
		this.nodes.add(node);
	}

	public List<BFSNode> getNodes() {
		return this.nodes;
	}
}
