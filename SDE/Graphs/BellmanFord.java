package SDE.Graphs;

// Bellman Form Algorithm | Detect Negative Weight Cycle in graphs
// works for directed graph except if there is a -ve cycle
// for undirected, convert ug to dg

import java.util.*;

public class BellmanFord {
    class Node{
        int u;
        int v;
        int wt;
        Node(int u, int v, int wt){
            this.u = u;
            this.v = v;
            this.wt = wt;
        }
    }
    public void bellmanFord(List<Node> adj, int V, int src){
        int dist[] = new int[V];
        Arrays.fill(dist, 10000000);
        
        dist[0] = 0;
        
        for(int i = 1; i <= V-1; i++){
            for(Node it: adj){
                if(dist[it.u] + it.wt < dist[it.v]){
                    dist[it.v] = dist[it.u] + it.wt;
                }
            }
        }

        boolean flag = true;
        for(Node it: adj){
            if(dist[it.u] + it.wt < dist[it.v]){
                flag = false;
                System.out.println("Negative cycle");
                break;
            }
        }
        if(flag){
            for(int i: dist) System.out.print(i + " ");
        }
    }
}
