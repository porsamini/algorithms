package algorithms.graphs.core;

import java.util.ArrayList;
import java.util.List;

import algorithms.data.GraphNode;

public class DFSNode extends GraphNode {
	int entry, exit;
	List<DFSNode> nodes = new ArrayList<DFSNode>();

	public DFSNode(int value) {
		super(value);
	}
	
	public int getExit() {
		return this.exit;
	}
	
	public int getEntry() {
		return this.entry;
	}
	
	public void setExit(int exit) {
		this.exit = exit;
	}
	
	public void setEntry(int entry) {
		this.entry = entry;
	}

	public void addNodes(DFSNode node) {
		this.nodes.add(node);
	}

	public List<DFSNode> getNodes() {
		return this.nodes;
	}
}
