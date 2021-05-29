package SDE.Graphs;

// Graph representation in Adjacency List
// Using List<List<Integer>> to store the information about connection

import java.util.*;

public class AdjacencyList {
    public static void main(String[] args) {
        int n = 3;
        int m = 3;

        List<List<Integer>> adj = new ArrayList<>();

        for(int i = 0; i <= n; i++){
            adj.add(new ArrayList<Integer>());
        }

        int inputs[][] = {{1,2}, {2, 3}, {1,3}};

        for(int i = 0; i < m; i++){
            adj.get(inputs[i][0]).add(inputs[i][1]);
            adj.get(inputs[i][1]).add(inputs[i][0]);
        }
    }
}
