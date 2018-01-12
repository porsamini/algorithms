package algorithms.graphs;
import algorithms.graphs.core.BFS;
import algorithms.graphs.core.BFSNode;

import java.util.List;
/**
 *
 * @author Vineeth Pradhan
 * ---With Integer as Adjacency List-------
 * ----------------------------------------
 * Execution Time for BFS: 424 milliseconds
 * int adjacencyListLengthLimit = 1000000;
 * int internalLengthLimit = 3;
 * ----------------------------------------
 * Execution Time for BFS: 71 milliseconds
 * int adjacencyListLengthLimit = 4000;
 * int internalLengthLimit = 90;
 * ----------------------------------------
 * ---With Node as Adjacency List----------
 * ----------------------------------------
 * Execution Time for BFS: 357 milliseconds
 * int adjacencyListLengthLimit = 1000000;
 * int internalLengthLimit = 3;
 * ----------------------------------------
 * Execution Time for BFS: 39 milliseconds
 * int adjacencyListLengthLimit = 4000;
 * int internalLengthLimit = 90;
 * ----------------------------------------
 *
 */
public class ExecuteBFS {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		int source = 2;

		BFS bfs = new BFS();
		List<BFSNode> list = bfs.getAdjacencyList();
		BFSNode sourceNode = list.get(source);
		sourceNode.setDistance(0);
		sourceNode.setVisited(true);
		bfs.traverse(source);

		long stop = System.currentTimeMillis();

//		for(BFSNode node: bfs.getAdjacencyList()) {
//			String distance = Integer.toString(node.getDistance());
//			if(node.getValue() != source && node.getDistance() == 0) {distance = "infinite";}
//			System.out.println(node.getValue()+": "+distance+" hop(s)");
//		}
		System.out.println("Execution Time for BFS: "+(stop - start)+" milliseconds");
	}
}
