package SDE.Graphs;

import java.util.ArrayList;

// Bridges in a graph | Cut Edge

public class Bridges {
    public void printBridges(ArrayList<ArrayList<Integer>> adj, int V){
        boolean vis[] = new boolean[V];
        int tin[] = new int[V];
        int low[] = new int[V];

        int timer = 0;

        for(int i = 0; i < V; i++){
            if(!vis[i]){
                dfs(adj, i, -1, tin, low, vis, timer);
            }
        }
    }
    public void dfs(ArrayList<ArrayList<Integer>> adj, int node, int parent, int[] tin, int low[], boolean[] vis, int timer){
        vis[node] = true;
        tin[node] = low[node] = timer++;

        for(int it: adj.get(node)){
            if(it == parent) continue;

            if(!vis[it]){
                dfs(adj, it, node, tin, low, vis, timer);
                low[node] = Math.min(low[node], low[it]);

                if(low[it] > tin[node]){
                    System.out.println(it + " " + node);
                }
            }else{
                low[node] = Math.min(low[node], tin[it]);
            }
        }
    }
}
