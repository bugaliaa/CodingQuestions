package SDE.Graphs;

// Disjoint Set | Union by Rank and Path Compression

public class DisjointSet {
    public static void main(String[] args) {
        int n = 10;
        int[] parent = new int[n];
        int[] rank = new int[n];

        makeSet(parent, rank, n);

        if(findParent(2, parent) != findParent(2, parent)){
            System.out.println("Different components");
        }
    }

    public static void makeSet(int[] parent, int[] rank, int n){
        for(int i = 0; i < n; i++){
            parent[i] = i;
            rank[i] = 0;
        }
    }

    public static int findParent(int node, int[] parent){
        if(node == parent[node]) return node;
        return parent[node] = findParent(parent[node], parent);
    }

    public static void union(int u, int v, int[] parent, int[] rank){
        u = findParent(u, parent);
        v = findParent(v, parent);

        if(rank[u] < rank[v]){
            parent[u] = v;
        }else if(rank[v] < rank[u]){
            parent[v] = u;
        }else{
            parent[v] = u; // parent[u] = v is also good
            rank[u]++; // rank[v]++ in other case
        }
    }
}
