package Graphs;

import java.util.*;

public class shortestpathDAG{
    static class Pair {
        int node;
        int weight;

        Pair(int node, int weight) {
            this.node = node;
            this.weight = weight;
        }
    }

    public int[] shortestPath(int V, int E, int[][] edges) {
        // Step 1: Build adjacency list
        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        /*
        for (int i = 0; i < M; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            int wt = edges[i][2];
            adj.get(u).add(new Pair(v, wt));
        }*/
        for (int[] edge : edges) {
            adj.get(edge[0]).add(new Pair(edge[1], edge[2]));
        }

        // Step 2: Perform topological sort
        int[] vis = new int[V];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < V; i++) {
            if (vis[i] == 0) toposort(i, vis, st, adj);
        }

        // Step 3: Initialize distance array
        int[] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[0] = 0; // Set source distance to 0

        // Step 4: Process nodes in topological order
        while (!st.isEmpty()) {
            int node = st.pop();

            /*
            for (int i = 0; i < adj.get(node).size(); i++) {
                int v = adj.get(node).get(i).first;
                int wt = adj.get(node).get(i).second;        
            */
            if (dist[node] != Integer.MAX_VALUE) {
                for (Pair p : adj.get(node)) {
                    int v = p.node;
                    int wt = p.weight;

                    if (dist[node] + wt < dist[v]) {
                        dist[v] = dist[node] + wt;
                    }
                }
            }
        }

        // Step 5: Replace unreachable distances with -1
        for (int i = 0; i < V; i++) {
            if (dist[i] == Integer.MAX_VALUE) {
                dist[i] = -1;
            }
        }

        return dist;
    }

    private static void toposort(int node, int[] vis, Stack<Integer> st, ArrayList<ArrayList<Pair>> adj) {
        vis[node] = 1;
        for (Pair p : adj.get(node)) {
            if (vis[p.node] == 0) toposort(p.node, vis, st, adj);
        }
        st.push(node);
    }
}

