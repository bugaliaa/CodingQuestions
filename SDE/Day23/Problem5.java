package SDE.Day23;

// https://practice.geeksforgeeks.org/problems/detect-cycle-in-an-undirected-graph/1
// Detect cycle in an undirected graph (GFG)

import java.util.*;

public class Problem5 {
    class Node{
        int first;
        int second;
        Node(int first, int second){
            this.second = second;
            this.first = first;
        }
    }
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj){
        boolean[] vis = new boolean[V];

        for(int i = 0; i < V; i++){
            if(!vis[i]) if(bfs(adj, vis, i)) return true;
        }
        return false;
    }
    public boolean bfs(ArrayList<ArrayList<Integer>> adj, boolean[] vis, int node){
        Queue<Node> q = new LinkedList<>();
        q.add(new Node(node, -1));
        vis[node] = true;

        while(!q.isEmpty()){
            int curr = q.peek().first;
            int prev = q.peek().second;
            q.remove();

            for(int it: adj.get(curr)){
                if(!vis[it]){
                    q.add(new Node(it, curr));
                    vis[it] = true;
                }else if(prev != it) return true;
            }
        }

        return false;
    }
}
