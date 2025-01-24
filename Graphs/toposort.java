package Graphs;

import java.util.*;

public class toposort {
    public int[] toposortDFS(ArrayList<ArrayList<Integer>> adj){
        int V = adj.size();
        int[] vis = new int[V];
        Stack<Integer> st = new Stack<>();
        for(int i=0; i < V; i++){
            if(vis[i]==0) dfs(i, vis, st, adj);
        }

        int ans[]=new int[V];
        int i=0;
        while(!st.isEmpty()){
            ans[i++] = st.pop();
        }
        return ans;
    }

    public static void dfs(int node, int[] vis, Stack<Integer> st, ArrayList<ArrayList<Integer>> adj){
        vis[node]=1;
        for(int i: adj.get(node)){
            if(vis[i]==0) dfs(i,vis,st,adj);
        }
        st.push(node);
    }
}
