package SDE.Day23;

// https://practice.geeksforgeeks.org/problems/topological-sort/1
// Topological Sorting (GFG)

import java.util.*;

public class Problem {
    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj){
        Stack<Integer> stack = new Stack<>();
        boolean[] vis = new boolean[V];

        for(int i = 0; i < V; i++){
            if(!vis[i]) dfs(adj, i, stack, vis);
        }

        int ans[] = new int[V];
        for(int i = 0; i < V; i++){
            ans[i] = stack.pop();
        }

        return ans;
    }
    static void dfs(ArrayList<ArrayList<Integer>> adj, int node, Stack<Integer> stack, boolean[] vis){
        vis[node] = true;
        for(int it: adj.get(node)){
            if(!vis[it]) dfs(adj, it, stack, vis);
        }
        stack.add(node);
    }
}
