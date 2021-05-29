package SDE.Graphs;

// Cycle Detection (BFS)

import java.util.*;

class Node{
    int first;
    int second;
    public Node(int first, int second){
        this.first = first;
        this.second = second;
    }
}
public class CycleDetectionBFS {
    public boolean cycleBfs(int V, List<List<Integer>> adj){
        boolean vis[] = new boolean[V+1];
        
        for(int i = 1; i <= V; i++){
            if(!vis[i]){
                if(isCycleBFS(adj, i, vis)) return true;
            }
        }

        return false;
    }
    public boolean isCycleBFS(List<List<Integer>> adj, int s, boolean vis[]){
        Queue<Node> q = new LinkedList<>();
        q.add(new Node(s, -1));
        vis[s] = true;

        while(!q.isEmpty()){
            int node = q.peek().first;
            int prev = q.peek().second;
            q.remove();

            for(int it: adj.get(node)){
                if(!vis[it]){
                    q.add(new Node(it, node));
                    vis[it] = true;
                }else if(prev != it) return true;
            }
        }

        return false;
    }
}
