package SDE.Graphs;

import java.util.*;

// Bipartite Graph using BFS

public class BipartiteGraph {
    public boolean isBipartite(ArrayList<ArrayList<Integer>> adj, int V){
        int color[] = new int[V+1];
        Arrays.fill(color, -1);

        for(int i = 1; i <= V; i++){
            if(color[i] == -1){
                if(!bfs(adj, i, color)) return false;
            }
        }

        return true;
    }
    public boolean bfs(ArrayList<ArrayList<Integer>> adj, int s, int[] color){
        Queue<Integer> q = new LinkedList<>();
        q.add(s);
        color[s] = 1;
        while(!q.isEmpty()){
            int node = q.poll();
            for(int it: adj.get(node)){
                if(color[it] == -1){
                    color[it] = 1 - color[node];
                    q.add(it);
                }else if(color[it] == color[node]) return false;
            }
        }

        return true;
    }
}
