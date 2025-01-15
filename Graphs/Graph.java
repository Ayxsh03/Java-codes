package Graphs;
import java.util.ArrayList;

public class Graph {
    private ArrayList<ArrayList<Integer>> adjList;
    private int n; // Number of vertices

    // Constructor
    public Graph(int n) {
        this.n = n;
        adjList = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>());
        }
    }

    // Print graph
    public void printGraph() {
        for (int i = 0; i < n; i++) {
            System.out.print(i + " -> ");
            for (int j = 0; j < adjList.get(i).size(); j++) {
                System.out.print(adjList.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }

    // Add edge undirected
    public void addEdge(int source, int destination) {
        adjList.get(source).add(destination);
        adjList.get(destination).add(source);
    }

    // Add edge directed
    public void addEdgeDirected(int source, int destination) {
        adjList.get(source).add(destination);
    }

    // //Add weighted edge undirected
    // public void addWeightedEdge(int source, int destination, int weight) {
    //     adjList.get(source).add(new Pair(destination, weight));
    //     adjList.get(destination).add(new Pair(source, weight));
    // }

    // // Add weighted edge directed
    // public void addWeightedEdgeDirected(int source, int destination, int weight) {
    //     adjList.get(source).add(destination);
    // }

    // static class Pair {
    //     int vertex;
    //     int weight;
    //     public Pair(int vertex, int weight) {
    //         this.vertex = vertex;
    //         this.weight = weight;
    //     }

    //     @Override
    //     public String toString() {
    //         return "(" + vertex + ", " + weight + ")";
    //     }
    // }

    static class Edge{
        int source;
        int destination;
        int weight;

        public Edge(int source, int destination, int weight) {
            this.source = source;
            this.destination = destination;
            this.weight = weight;
        }
    }

}
