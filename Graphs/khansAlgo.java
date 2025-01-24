package Graphs;
import java.util.*;

public class khansAlgo {
    public int[] toposortBFS(ArrayList<ArrayList<Integer>> adj){
        int V = adj.size();
        int[] indegree = new int[V];

        for(int u = 0; u < V; u++){
            for(int v : adj.get(u)){
                indegree[v]++;
            }
        }

        Queue<Integer> q= new LinkedList<>();
        for(int i=0; i<V;i++){
            if(indegree[i]==0){
                q.offer(i);
            }
        }

        int[] topo = new int[V];
        int i=0;
        while(!q.isEmpty()){
            int node = q.poll();
            topo[i++] = node;
            //Reduce indegree
            for(int v: adj.get(node)){
                indegree[v]--;
                if(indegree[v]==0){
                    q.offer(v);
                }
            }
        }
        return topo;
    }
}
