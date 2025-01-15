package Graphs;
import java.util.ArrayList;

public class dfs_graph {
    static void dfs(ArrayList<ArrayList<Integer>> adj, int s, boolean[] visited, ArrayList<Integer> ans){
        //s = starting, d = ending
        visited[s] = true;
        ans.add(s);
        //getting neighbour nodes
        for(int d: adj.get(s)){
            if(!visited[d]){
                dfs(adj, d, visited, ans);
            }
        }
    }
    public ArrayList<Integer> dfsOfGraph(ArrayList<ArrayList<Integer>> adj) {
        int V = adj.size();
        boolean[] visited = new boolean[V];
        ArrayList<Integer> res = new ArrayList<>();
        dfs(adj, 0, visited, res);
        return res;
    }
}
