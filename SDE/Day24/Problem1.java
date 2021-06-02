package SDE.Day24;

// https://practice.geeksforgeeks.org/problems/strongly-connected-components-kosarajus-algo/1
// SCC using Kosaraju's Algorithm (GFG)

import java.util.*;

public class Problem1 {
    public int kosaraju(int V, ArrayList<ArrayList<Integer>> adj){
        Stack<Integer> stack = new Stack<>();
        boolean[] vis = new boolean[V];
        int ans = 0;

        for(int i = 0; i < V; i++){
            if(!vis[i]) topoSort(adj, stack, i, vis);
        }

        ArrayList<ArrayList<Integer>> transpose = new ArrayList<>();

        for(int i = 0; i < V; i++){
            vis[i] = false;
            transpose.add(new ArrayList<>());
        }

        for(int i = 0; i < V; i++){
            for(int it: adj.get(i)){
                transpose.get(it).add(i);
            }
        }

        while(!stack.isEmpty()){
            int node = stack.pop();
            if(!vis[node]){
                revDFS(transpose, node, vis);
                ans++;
            }
        }

        return ans;
    }
    public void revDFS(ArrayList<ArrayList<Integer>> transpose, int node, boolean[] vis){
        vis[node] = true;
        for(int it: transpose.get(node)){
            if(!vis[it]) revDFS(transpose, it, vis);
        }
    }
    public void topoSort(ArrayList<ArrayList<Integer>> adj, Stack<Integer> stack, int node, boolean[] vis){
        vis[node] = true;
        for(int it: adj.get(node)){
            if(!vis[it]) topoSort(adj, stack, it, vis);
        }
        stack.add(node);
    }
}
