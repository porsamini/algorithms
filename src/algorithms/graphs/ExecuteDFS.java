package algorithms.graphs;
import algorithms.graphs.core.DFS;
import algorithms.graphs.core.DFSNode;

import java.util.List;
/**
 * @author Vineeth Pradhan
 * ----------------------------------------
 * Execution Time for BFS: 357 milliseconds
 * int adjacencyListLengthLimit = 1000000;
 * int internalLengthLimit = 3;
 * ----------------------------------------
 * Execution Time for DFS: 43 milliseconds
 * int adjacencyListLengthLimit = 4000;
 * int internalLengthLimit = 90;
 * ----------------------------------------
 */
public class ExecuteDFS {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		int source = 2;

		DFS dfs = new DFS();
		List<DFSNode> list = dfs.getAdjacencyList();
		DFSNode sourceNode = list.get(source);
		dfs.traverse(sourceNode);

		long stop = System.currentTimeMillis();

//		for(DFSNode node: dfs.getAdjacencyList()) {
//			String entry = Integer.toString(node.getEntry());
//			String exit = Integer.toString(node.getExit());
//			if(node.getEntry() == 0) {entry = "infinite"; exit = "infinite";}
//			System.out.println(node.getValue()+": ["+entry+", "+exit+"]");
//		}
		System.out.println("Execution Time for DFS: "+(stop - start)+" milliseconds");
	}
}
