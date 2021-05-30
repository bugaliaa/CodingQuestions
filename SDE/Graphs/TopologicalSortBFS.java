package SDE.Graphs;

import java.util.*;

// Topological Sort using BFS (Kahn's Algorithm)

public class TopologicalSortBFS {
    public ArrayList<Integer> topoSort(ArrayList<ArrayList<Integer>> adj, int V){
        ArrayList<Integer> list = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        int[] indegree = new int[V];
        Arrays.fill(indegree, 0);

        for(int i = 0; i < V; i++){
            for(int j: adj.get(i)) indegree[j]++;
        }

        for(int i = 0; i < V; i++){
            if(indegree[i] == 0) q.add(i);
        }

        while(!q.isEmpty()){
            int node = q.poll();
            list.add(node);
            for(int i: adj.get(node)){
                indegree[i]--;
                if(indegree[i] == 0) q.add(i);
            }
        }

        return list;
    }
}
