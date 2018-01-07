# Algorithms

This repo is for comparing the performance of algorithms that solves a given problem with input size of 1 million

## Techniques

* Sorting
    * InsertionSort
    * ReverseSort
    * SelectionSort
    * MergeSort

* Finding the largest consecutive sub-array
     * Recursion

* Searching
     * Linear Search

* Graphs
     * Breadth First Search

## Run it yourself
### To run and test the results on Docker
* Install Docker 17 or later versions
* Run the command `sh build.sh` in the terminal to create a docker and spin up an instance of the image
* In the docker console, run the command `alg` and type in the algorithm namespace to run the test

### To run and test the results locally
* This repo runs on Java 1.8 and haven't been tested on earlier or later versions
* Compile the source with the command `mkdir out/ && find src/algorithms/ -name "*.java" -exec javac -d out/ {} +`. This should create all the classfiles in `out/` directory
* Run `java -cp out/ algorithms.sorting.ExecutionSort` to test the execution time on your local machine for insertion sort. Check algorithm namespace for more examples

## Processor
2.6 GHz Intel Core i7

## Random execution times for 1 million records in primitive array:

### Sorting

```
Execution Time for InsertionSort/ReverseSort: ~293965 milliseconds
Execution Time for SelectionSort: ~119506 milliseconds
Execution Time for MergeSort: ~263 milliseconds
```

### Recursion

```
Execution Time for finding the largest consecutive sub-array using recursion: ~231 milliseconds
```

### Linear search

```
Execution Time for LinearSearch: ~39 milliseconds
```

### Breadth First search

```
Execution Time for BFS with 3 as internalLengthLimit: ~357 milliseconds
```
