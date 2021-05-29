package SDE.Graphs;

// Graph Representation using Adjacency Matrix
// We will be given number of vertices and number of edges
// In the input there will be m lines which will contain
// u(1st edge) and v(2nd edge)

public class AdjancencyMatrix {
    public static void main(String[] args) {
        int n = 3; // number of vertex
      //  int m = 3; // number of edges

        int[][] adj = new int[n+1][n+1];

        //edge 1----2
        adj[1][2] = 1;
        adj[2][1] = 1;

        //edge 2----3
        adj[2][3] = 1;
        adj[3][2] = 1;

        //edge 1----3
        adj[1][3] = 1;
        adj[3][1] = 1;
    }
}
