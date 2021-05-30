package SDE.Graphs;

import java.util.*;

// Shortest Path in Undirected Path with unit weigths or no weight

public class ShortestPathUndirectedGraph {
    public void shortestDistance(ArrayList<ArrayList<Integer>> adj, int V, int src){
        Queue<Integer> q = new LinkedList<>();
        int dist[] = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        q.add(src);
        dist[src] = 0;
        while(!q.isEmpty()){
            int node = q.poll();
            for(int i: adj.get(node)){
                q.add(i);
                if(dist[node]+1 < dist[i]){
                    dist[i] = dist[node]+1;
                    q.add(i);
                }
            }
        }
        for(int i: dist) System.out.print(i + " ");
    }
}
