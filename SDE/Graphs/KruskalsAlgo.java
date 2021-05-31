package SDE.Graphs;

// Kruskal's Algorithm for MST using Disjoint Set

import java.util.*;

public class KruskalsAlgo {
    class Node{
        private int u;
        private int v;
        private int weight;
        Node(int u, int v, int weight){
            this.u = u;
            this.v = v;
            this.weight = weight;
        }
    }
    public void kruskalAlgo(ArrayList<Node> adj){
        
        Collections.sort(adj, (a,b) -> b.weight - a.weight);
        
        int n = adj.size();
        ArrayList<Integer> parent = new ArrayList<>();
        ArrayList<Integer> rank = new ArrayList<>();
        ArrayList<Node> mst = new ArrayList<>();
        int costMST = 0;
        
        makeSet(parent, rank, n);

        for(Node it: adj){
            if(findParent(it.u, parent) != findParent(it.v, parent)){
                union(it.u, it.v, parent, rank);
                mst.add(it);
                costMST += it.weight;
            }
        }
        System.out.println(costMST);
        for(Node it: mst) System.out.println(it.u + " " + it.weight);
    }

    public int findParent(int node, ArrayList<Integer> parent){
        if(node == parent.get(node)) return node;
        return parent.set(node, findParent(parent.get(node), parent));
    }

    public void makeSet(ArrayList<Integer> parent, ArrayList<Integer> rank, int n){
        for(int i = 0; i < n; i++){
            parent.add(i);
            rank.add(0);
        }
    }

    public void union(int u, int v, ArrayList<Integer> parent, ArrayList<Integer> rank){
        u = findParent(u, parent);
        v = findParent(v, parent);

        if(rank.get(u) < rank.get(v)){
            parent.set(u, v);
        }else if(rank.get(u) > rank.get(v)){
            parent.set(v, u);
        }else{
            parent.set(v, u);
            rank.set(u, rank.get(u)+1);
        }
    }

}
