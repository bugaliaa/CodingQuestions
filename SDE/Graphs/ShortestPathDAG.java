package SDE.Graphs;

// Shortest Path in Directed Acyclic Graph with weights

import java.util.*;

class Pair{
    private int v;
    private int weight;
    Pair(int v, int weight){
        this.v = v;
        this.weight = weight;
    }
    int getV(){return v;}
    int getWeight(){return weight;}
}

public class ShortestPathDAG {
    public void shortestDistance(ArrayList<ArrayList<Pair>> adj, int V, int src){
        int dist[] = new int[V];
        boolean vis[] = new boolean[V];
        Stack<Integer> stack = new Stack<>();
        
        for(int i = 0; i < V; i++){
            if(!vis[i]) topoSort(adj, stack, vis, i);
        }
        
        Arrays.fill(dist, Integer.MAX_VALUE);

        while(!stack.isEmpty()){
            int node = stack.pop();
            if(dist[node] != Integer.MAX_VALUE){
                for(Pair it: adj.get(node)){
                    if(dist[it.getV()] > it.getWeight()+dist[node]) dist[it.getV()] = it.getWeight()+dist[node];
                }
            }
        }
        for(int i: dist) System.out.print(i + " ");
    }
    public void topoSort(ArrayList<ArrayList<Pair>> adj, Stack<Integer> stack, boolean vis[], int node){
        vis[node] = true;
        for(Pair i: adj.get(node)){
            if(!vis[i.getV()]) topoSort(adj, stack, vis, i.getV());
        }
        stack.add(node);
    }
}
