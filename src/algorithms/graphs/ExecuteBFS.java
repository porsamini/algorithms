package algorithms.graphs;
import algorithms.data.AdjacencyList;
import algorithms.graphs.core.*;
import java.util.ArrayList;
import java.util.List;

public class ExecuteBFS {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		List<BFSNode> adjacencyList = new ArrayList<BFSNode>();
		List<List<Integer>> list = new AdjacencyList().getList();
		for(int i = 0; i < list.size(); i++) {
			adjacencyList.add(new BFSNode(i));
		}

		for(int i = 0; i < list.size(); i++) {
			for(int j = 0; j < list.get(i).size(); j++) {
				BFSNode bfsNode = adjacencyList.get(list.get(i).get(j));
				adjacencyList.get(i).addNodes(bfsNode);
			}
		}

		int source = 2;
		BFS bfs = new BFS(adjacencyList);
		BFSNode sourceNode = adjacencyList.get(source);
		sourceNode.setDistance(0);
		sourceNode.setVisited(true);
		bfs.traverse(source);

		long stop = System.currentTimeMillis();

		for(BFSNode node: bfs.getAdjacencyList()) {
			String distance = Integer.toString(node.getDistance());
			if(node.getValue() != source && node.getDistance() == 0) {distance = "infinite";}
			System.out.println(node.getValue()+": "+distance+" hop(s)");
		}
		System.out.println("Execution Time for BFS: "+(stop - start)+" milliseconds");
	}
}
