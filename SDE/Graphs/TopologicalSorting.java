package SDE.Graphs;

// Topological Sort using DFS

import java.util.ArrayList;
import java.util.Stack;

public class TopologicalSorting {
    public ArrayList<Integer> topoSort(int V, ArrayList<ArrayList<Integer>> adj){
        boolean vis[] = new boolean[V];
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < V; i++){
            if(!vis[i]){
                dfs(adj, i, stack, vis);
            }
        }
        return new ArrayList<>(stack);
    }
    public void dfs(ArrayList<ArrayList<Integer>> adj, int index, Stack<Integer> stack, boolean[] vis){
        vis[index] = true;
        for(int it: adj.get(index)){
            if(!vis[index]) dfs(adj, it, stack, vis);
        }
        stack.add(index);
    }
}
