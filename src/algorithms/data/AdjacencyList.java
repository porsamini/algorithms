package algorithms.data;
import java.util.ArrayList;
import java.util.List;

public class AdjacencyList {
	List<List<Integer>> adjacencyList = new ArrayList<List<Integer>>();

	public List<List<Integer>> getList() {
		int adjacencyListLengthLimit = 1000000;
		int internalLengthLimit = 3;
		int internalWeightLimit = adjacencyListLengthLimit;

		System.out.println("Adjacency List ---");
		for(int i = 0; i < adjacencyListLengthLimit; i++) {
			List<Integer> items = new ArrayList<Integer>();
			int randomInternalLength = random(internalLengthLimit);
			for(int j = 0; j < randomInternalLength; j++) {
				int value = random(internalWeightLimit);
				if(items.contains(value) || value == i) { j--; }
				else { items.add(value); }
			}
			adjacencyList.add(items);
			System.out.println(""+i+": "+adjacencyList.get(i));
		}
//		System.out.println("Adjacency List ---");
		return adjacencyList;
//		System.out.println("Size of the adjacencyList: "+adjacencyList.size());
	}

	// Anything between 0 and limit
	public int random(int limit) {
		return (int)(Math.random()*(limit));
	}

}
