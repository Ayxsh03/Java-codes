package Graphs;

import java.util.Arrays;
import java.util.PriorityQueue;

public class printDijkastra {
    static class Node implements Comparable<Node> {
        int vertex, weight;
        Node(int v, int w) {
            this.vertex = v;
            this.weight = w;
        }
        public int compareTo(Node other) {
            return this.weight - other.weight; // Min-Heap based on weight
        }
    }

    // Function to find the shortest path from source to all vertices
    public static void dijkstra(int[][] graph, int source) {
        int V = graph.length; // Number of vertices
        int[] dist = new int[V]; // Stores shortest distance
        int[] parent = new int[V]; // Stores shortest path tree
        boolean[] visited = new boolean[V]; // Tracks visited nodes

        Arrays.fill(dist, Integer.MAX_VALUE);
        Arrays.fill(parent, -1);
        dist[source] = 0;

        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.add(new Node(source, 0));

        while (!pq.isEmpty()) {
            Node node = pq.poll();
            int u = node.vertex;

            if (visited[u]) continue;
            visited[u] = true;

            for (int v = 0; v < V; v++) {
                if (graph[u][v] > 0 && !visited[v]) {
                    int newDist = dist[u] + graph[u][v];

                    if (newDist < dist[v]) {
                        dist[v] = newDist;
                        parent[v] = u;
                        pq.add(new Node(v, newDist));
                    }
                }
            }
        }

        printShortestPaths(dist, parent, source);
    }

    // Function to print shortest paths
    private static void printShortestPaths(int[] dist, int[] parent, int source) {
        System.out.println("Vertex\t Distance\t Path");
        for (int i = 0; i < dist.length; i++) {
            System.out.print(i + "\t " + dist[i] + "\t\t ");
            printPath(parent, i);
            System.out.println();
        }
    }

    // Function to reconstruct the path
    private static void printPath(int[] parent, int vertex) {
        if (vertex == -1) return;
        printPath(parent, parent[vertex]);
        System.out.print(vertex + " ");
    }
}
