package SDE.Day23;

// https://practice.geeksforgeeks.org/problems/detect-cycle-in-a-directed-graph/1
// Detect cycle in a directed graph (GFG)

import java.util.*;

public class Problem4 {
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj){
        boolean vis[] = new boolean[V];
        boolean dfsVis[] = new boolean[V];

        for(int i = 0; i < V; i++){
            if(dfs(adj, vis, dfsVis, i)) return true;
        }

        return false;
    }
    public boolean dfs(ArrayList<ArrayList<Integer>> adj, boolean[] vis, boolean[] dfsVis, int node){
        vis[node] = true;
        dfsVis[node] = true;

        for(int it: adj.get(node)){
            if(!vis[it]){
                if(dfs(adj, vis, dfsVis, it)) return true;
            }else if(dfsVis[it]) return true;
        }

        dfsVis[node] = false;

        return false;
    }
}
