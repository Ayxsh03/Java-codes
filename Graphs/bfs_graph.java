package Graphs;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class bfs_graph {
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // code here
        ArrayList<Integer> bfs=new ArrayList<>();
        Queue<Integer> q= new LinkedList<>();
        boolean vis[] =new boolean[V];
        
        vis[0]=true;
        q.add(0);
        
        while(!q.isEmpty()){
            int node= q.poll();
            bfs.add(node);
            for(int it: adj.get(node)){
                if(!vis[it]){
                    q.add(it);
                    vis[it]=true;
                }

            }
        }
        return bfs;
    }
}
