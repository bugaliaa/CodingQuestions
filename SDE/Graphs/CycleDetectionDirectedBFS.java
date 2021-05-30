package SDE.Graphs;

import java.util.*;

// Cycle Detection in Directed Graph using BFS (Kahn's Algorithm)

public class CycleDetectionDirectedBFS {
    public boolean cycleDetect(ArrayList<ArrayList<Integer>> adj, int V){
        Queue<Integer> q = new LinkedList<>();
        int[] indegree = new int[V];
        int count = 0;

        for(int i = 0; i < V; i++){
            for(int j: adj.get(i)) indegree[j]++;
        }
        
        for(int i = 0; i < V; i++){
            if(indegree[i] == 0) q.add(i);
        }

        while(!q.isEmpty()){
            int node = q.poll();
            count++;
            for(int i: adj.get(node)){
                indegree[i]--;
                if(indegree[i] == 0) q.add(i);
            }
        }

        if(count == V) return false;
        return true;

    }
}
