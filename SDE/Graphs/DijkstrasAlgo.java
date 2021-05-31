package SDE.Graphs;

// Dijkstra's ALgorithm | Shortest Path in Undirected Graph with weights

import java.util.*;

public class DijkstrasAlgo {
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
    public void dijkstraAlgo(ArrayList<ArrayList<Pair>> adj, int V, int src){
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> b.getWeight() - a.getWeight());
        int dist[] = new int[V];
        
        Arrays.fill(dist, Integer.MAX_VALUE);
        
        pq.add(new Pair(src, 0));

        while(!pq.isEmpty()){
            Pair node = pq.poll();
            for(Pair it: adj.get(node.getV())){
                if(it.getWeight()+node.getWeight() < dist[it.getV()]){
                    dist[it.getV()] = it.getWeight()+node.getWeight();
                    pq.add(new Pair(it.getV(), dist[it.getV()]));
                }
            }
        }

        for(int i: dist) System.out.print(i + " ");
    }
}
