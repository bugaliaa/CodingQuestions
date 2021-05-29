package SDE.Graphs;

import java.util.ArrayList;

// Cycle Detection using DFS

public class CycleDetectionDFS {
    public boolean isCycle(ArrayList<ArrayList<Integer>> adj, int V){
        boolean[] vis = new boolean[V+1];

        for(int i = 1; i <= V; i++){
            if(!vis[i]){
                if(cycleDFS(adj, i, -1, vis)) return true;
            }
        }

        return false;
    }

    public boolean cycleDFS(ArrayList<ArrayList<Integer>> adj, int node, int prev, boolean[] vis){
        vis[node] = true;
        for(int i: adj.get(node)){
            if(!vis[i]) if(cycleDFS(adj, i, node, vis)) return true;
            else if(i != prev) return true;
        }
        return false;
    }
}
