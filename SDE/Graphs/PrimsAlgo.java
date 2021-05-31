package SDE.Graphs;

import java.util.ArrayList;

// Prim's Algorithm for Minimum Spanning Tree

public class PrimsAlgo {
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
    public void primsAlgo(ArrayList<ArrayList<Pair>> adj, int V){
        boolean mstSet[] = new boolean[V];
        int key[] = new int[V];
        int parent[] = new int[V];
        
        for(int i = 0; i < V; i++){
            mstSet[i] = false;
            key[i] = Integer.MAX_VALUE;
            parent[i] = -1;
        }

        key[0] = 0;

        for(int i = 0; i < V-1; i++){
            int mini = Integer.MAX_VALUE;
            int u = 0;

            for(int v = 0; v < V; v++){
                if(!mstSet[v] && key[v] < mini){
                    mini = key[v];
                    u = v;
                }
            }

            mstSet[u] = true;

            for(Pair it: adj.get(u)){
                if(!mstSet[it.getV()] && it.getWeight() < key[it.getV()]){
                    key[it.getV()] = it.getWeight();
                    parent[it.getV()] = u;
                }
            }
        }

        for(int i: parent) System.out.print(i + " ");
    }
}
