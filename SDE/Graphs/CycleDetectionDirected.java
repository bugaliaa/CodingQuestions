package SDE.Graphs;

import java.util.ArrayList;

// Cycle Detection in Directed Graph using DFS

public class CycleDetectionDirected {
    public boolean cycleDetection(int V, ArrayList<ArrayList<Integer>> adj){
        boolean[] dfsVis = new boolean[V+1];
        boolean[] vis = new boolean[V+1];
        for(int i = 1; i <= V; i++){
            if(isCycle(adj, vis, dfsVis, i)) return true;
        }
        return false;
    }
    public boolean isCycle(ArrayList<ArrayList<Integer>> adj, boolean[] vis, boolean[] dfsVis, int index){
        vis[index] = true;
        dfsVis[index] = true;
        for(int i: adj.get(index)){
            if(!vis[i]){
                if(isCycle(adj, vis, dfsVis, i)) return true;
            }else if(dfsVis[i]) return true;
        }
        dfsVis[index] = false;
        return false;
    }
}
