package SDE.Graphs;

import java.util.*;

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

        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> b.getWeight() - a.getWeight());        
        key[0] = 0;
        pq.add(new Pair(0, key[0]));

        for(int i = 0; i < V-1; i++){
            int u = pq.poll().getV();

            mstSet[u] = true;

            for(Pair it: adj.get(u)){
                if(!mstSet[it.getV()] && it.getWeight() < key[it.getV()]){
                    key[it.getV()] = it.getWeight();
                    parent[it.getV()] = u;
                    pq.add(new Pair(it.getV(), key[it.getV()]));
                }
            }
        }

        for(int i: parent) System.out.print(i + " ");
    }
}
