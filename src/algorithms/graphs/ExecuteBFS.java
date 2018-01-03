package algorithms.graphs;
import algorithms.data.TwoDCustomArray;
import algorithms.graphs.core.*;
import java.util.ArrayList;
import java.util.List;

public class ExecuteBFS {
	public static void main(String[] args) {
		List<BFSNode> adjacencyList = new ArrayList<BFSNode>();
		TwoDCustomArray twoD = new TwoDCustomArray();
		int[][] list = twoD.getList();
		for(int i = 0; i < list.length; i++) {
			adjacencyList.add(new BFSNode(i));
		}

		for(int i = 0; i < list.length; i++) {
			for(int j = 0; j < list[i].length; j++) {
				BFSNode bfsNode = adjacencyList.get(list[i][j]);
				adjacencyList.get(i).addNodes(bfsNode);
			}
		}

		int source = 2;
		BFS bfs = new BFS(adjacencyList);
		BFSNode sourceNode = adjacencyList.get(source);
		sourceNode.setDistance(0);
		sourceNode.setVisited(true);
		bfs.traverse(source);

		for(BFSNode node: bfs.getAdjacencyList()) {
			System.out.println(node.getValue()+": "+node.getDistance()+" hops");
		}
	}
}
