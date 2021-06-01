package SDE.Graphs;

// Kosaraju's Algorithm for Strongly Connected Component (SCC)
// Helps to find scc in directed graph

import java.util.*;

public class KosarajusAlgo {
    public List<List<Integer>> kosaraju(List<List<Integer>> adj, int V){
        List<List<Integer>> ans = new ArrayList<>();
        boolean[] vis = new boolean[V];
        Stack<Integer> stack = new Stack<>();
        
        for(int i = 0; i < V; i++){
            if(!vis[i]) topoSort(adj, stack, vis, i);
        }

        List<List<Integer>> transpose = new ArrayList<>();

        for(int i = 0; i < V; i++) transpose.add(new ArrayList<>());

        for(int i = 0; i < V; i++){
            vis[i] = false;
            for(int it: adj.get(i)){
                transpose.get(it).add(i);
            }
        }

        while(!stack.isEmpty()){
            int node = stack.pop();
            if(!vis[node]){
                List<Integer> temp = new ArrayList<>();
                revDFS(transpose, temp, node, vis);
                ans.add(temp);
            }
        }

        return ans;
    }

    public void revDFS(List<List<Integer>> transpose, List<Integer> temp, int node, boolean[] vis){
        vis[node] = true;
        temp.add(node);
        for(int it: transpose.get(node)){
            if(!vis[it]){
                revDFS(transpose, temp, it, vis);
            }
        }
    }

    public void topoSort(List<List<Integer>> adj, Stack<Integer> stack, boolean[] vis, int node){
        vis[node] = true;
        for(int it: adj.get(node)){
            if(!vis[it])topoSort(adj, stack, vis, it);
        }
        stack.add(node);
    }
}
