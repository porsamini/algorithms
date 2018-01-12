package algorithms.graphs.core;

public class Graph {
	int adjacencyListLengthLimit = 6000;
	int internalLengthLimit = 3;
	int internalWeightLimit = adjacencyListLengthLimit;

	// Anything between 0 and limit
	public int random(int limit) {
		return (int)(Math.random()*(limit));
	}
}
