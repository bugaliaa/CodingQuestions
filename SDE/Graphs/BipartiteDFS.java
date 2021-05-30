package SDE.Graphs;

import java.util.*;

// Bipartite Graph using DFS

public class BipartiteDFS {
    public boolean isBipartite(int V, ArrayList<ArrayList<Integer>> adj){
        int colors[] = new int[V+1];
        for(int i = 1; i <= V; i++){
            if(colors[i] == -1){
                if(!dfs(i, adj, colors)) return false;
            }
        }
        return true;
    }
    public boolean dfs(int index, ArrayList<ArrayList<Integer>> adj, int colors[]){
        colors[index] = 1;
        for(int i: adj.get(index)){
            if(colors[index] == -1){
                colors[i] = 1 - colors[index];
                if(!dfs(i, adj, colors)) return false;
            }else if(colors[i] == colors[index]) return false;
        }
        return true;
    }
}
