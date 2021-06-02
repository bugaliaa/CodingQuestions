package SDE.Day23;

// https://leetcode.com/problems/is-graph-bipartite/
// Is Graph Bipartite (LeetCode)

import java.util.*;

public class Problem7 {
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        
        int[] color = new int[n];
        Arrays.fill(color, -1);
        
        for(int i = 0; i < n; i++){
            if(color[i] == -1){
                if(!bfs(graph, color, i)) return false;
            }
        }

        return true;
    }
    public boolean bfs(int[][] graph, int[] color, int s){
        Queue<Integer> q = new LinkedList<>();
        q.add(s);
        color[s] = 1;
        while(!q.isEmpty()){
            int node = q.poll();
            for(int it: graph[node]){
                if(color[it] == -1){
                    color[it] = 1 - color[node];
                    q.add(it);
                }else if(color[it] == color[node]) return false;
            }
        }
        return true;
    }
}
