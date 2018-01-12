package algorithms.graphs.core;

import java.util.ArrayList;
import java.util.List;

import algorithms.data.GraphNode;

public class BFSNode extends GraphNode {
	int distance;
	List<BFSNode> nodes = new ArrayList<BFSNode>();
	
	public BFSNode(int source) {
		super(source);
	}

	public void setDistance(int dist) {
		this.distance = dist;
	}

	public int getDistance() {
		return this.distance;
	}

	public void addNodes(BFSNode node) {
		this.nodes.add(node);
	}

	public List<BFSNode> getNodes() {
		return this.nodes;
	}
}
