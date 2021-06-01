package SDE.Day23;

// https://practice.geeksforgeeks.org/problems/bfs-traversal-of-graph/1
// BFS in a graph (GFG)

import java.util.*;

public class Problem3 {
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj){
        ArrayList<Integer> list = new ArrayList<>();
        boolean[] vis = new boolean[V];

        for(int i = 0; i < V; i++){
            if(!vis[i]){
                Queue<Integer> q = new LinkedList<>();
                q.add(i);
                vis[i] = true;
                while(!q.isEmpty()){
                    int node = q.poll();
                    list.add(node);
                    for(int it: adj.get(node)){
                        if(!vis[it]){
                            vis[it] = true;
                            q.add(it);
                        }
                    }
                }
            }
        }       

        return list;
    }
}
