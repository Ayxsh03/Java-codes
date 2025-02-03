package Graphs;
import java.util.*;

public class dijkstraAlgo {
    public static ArrayList<Integer> dijkstra(ArrayList<ArrayList<Pair>> adj, int src){
        PriorityQueue<Pair> q = new PriorityQueue<>((x,y) -> x.dist - y.dist);
        ArrayList<Integer> dist = new ArrayList<>();
        int n = adj.size();
        for(int i = 0; i < n; i++) dist.add(Integer.MAX_VALUE);
        dist.set(src,0);
        q.add(new Pair(0, src));
        while(!q.isEmpty()){
            Pair p = q.poll();
            int node = p.node;
            int dis = p.dist;
            for(Pair neighbour: adj.get(node)){
                if(dis + neighbour.dist < dist.get(neighbour.node)){
                    dist.set(neighbour.node, dis + neighbour.dist);
                    q.add(new Pair(dis + neighbour.dist, neighbour.node));
                }
            }
        }
        return dist;
    }
    static class Pair {
        int dist, node;
        Pair(int first, int second) {
            this.dist = first;
            this.node = second;
        }
    }
}
