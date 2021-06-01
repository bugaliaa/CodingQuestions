package SDE.Graphs;

// Articulation Point, similar to Bridge in graph

import java.util.*;

public class ArticulationPoint {
    public ArrayList<Integer> findPoint(ArrayList<ArrayList<Integer>> adj, int V){
        ArrayList<Integer> list = new ArrayList<>();
        
        boolean vis[] = new boolean[V];
        int tin[] = new int[V];
        int low[] = new int[V];

        int timer = 0;

        for(int i = 0; i < V; i++){
            if(!vis[i]){
                dfs(i, -1, vis, tin, low, timer, adj, list);
            }
        }

        return list;
    }
    public void dfs(int node, int parent, boolean[] vis, int[] tin, int[] low, int timer, ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> list){
        vis[node] = true;
        tin[node] = low[node] = timer++;
        int child = 0;

        for(int it: adj.get(node)){
            if(it == parent) continue;

            if(!vis[it]){
                dfs(it, node, vis, tin, low, timer, adj, list);
                low[node] = Math.min(low[node], low[it]);

                if(low[it] >= tin[node] && parent != -1){
                    list.add(it);
                }
                child++;
            }else{
                low[node] = Math.min(low[node], tin[it]);
            }
        }
        if(parent == -1 && child > 1) list.add(node);
    }
}
