package Graphs;
import java.util.ArrayList;
import java.util.List;

public class printAdjList {
    public List<List<Integer>> printGraph(int V, int edges[][]) {
        
        List<List<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adjList.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            int u = edge[0]; // Source node
            int v = edge[1]; // Destination node

            adjList.get(u).add(v); // Add v to the list of u
            adjList.get(v).add(u); // Add u to the list of v (since the graph is undirected)
        }
        return adjList;
    }
}
