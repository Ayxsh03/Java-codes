package Graphs;
import java.util.*;

public class shortestpathUG {
    public int[] shortestPath(ArrayList<ArrayList<Integer>> adj, int src) {
        Queue<Integer> q = new LinkedList<>();
        int[] dist = new int[adj.size()];
        Arrays.fill(dist, Integer.MAX_VALUE);
        q.add(src);
        dist[src] = 0;
        while (!q.isEmpty()) {
            int u = q.poll();
            for (int v : adj.get(u)) {
                if (dist[u] + 1 < dist[v]) {
                    dist[v] = dist[u] + 1;
                    q.offer(v);
                }
            }
        }
        return dist;
    }
}
