package SDE.Day23;

// https://practice.geeksforgeeks.org/problems/depth-first-traversal-for-a-graph/1
// DFS in graph (GFG)

import java.util.*;

public class Problem2 {
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj){
        ArrayList<Integer> ans = new ArrayList<>();
        boolean[] vis = new boolean[V];
        for(int i = 0; i < V; i++){
            if(!vis[i]) dfs(adj, vis, i, ans);
        }
        return ans;
    }

    public void dfs(ArrayList<ArrayList<Integer>> adj, boolean[] vis, int node, ArrayList<Integer> ans){
        vis[node] = true;
        ans.add(node);
        for(int it: adj.get(node)){
            if(!vis[it]) dfs(adj, vis, it, ans);
        }        
    }
}
