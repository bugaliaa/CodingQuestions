package SDE.Graphs;

import java.util.*;

public class Traversals {
    public static void main(String[] args) {
        List<List<Integer>> adj = new ArrayList<>();
        int n = 7;

        for(int i = 0; i <= n; i++) adj.add(new ArrayList<>());

        adj.get(1).add(2);

        adj.get(2).add(1);
        adj.get(2).add(3);
        adj.get(2).add(7);

        adj.get(3).add(2);
        adj.get(3).add(5);

        adj.get(4).add(6);

        adj.get(5).add(3);
        adj.get(5).add(7);

        adj.get(6).add(4);

        adj.get(7).add(2);
        adj.get(7).add(5);

        ArrayList<Integer> ans = bfs(n, adj);

        for(int i: ans) System.out.print(i + " ");
        System.out.println();

        ArrayList<Integer> ans2 = dfs(n, adj);

        for(int i: ans2) System.out.print(i + " ");
        
    }
    public static ArrayList<Integer> bfs(int V, List<List<Integer>> adj){
        ArrayList<Integer> list = new ArrayList<>();
        boolean[] vis = new boolean[V+1];

        for(int i = 1; i <= V; i++){
            if(!vis[i]){
                    Queue<Integer> q = new LinkedList<>();
                    q.add(i);
                    vis[i] = true;

                    while(!q.isEmpty()){
                        Integer node = q.poll();
                        list.add(node);

                        for(int it: adj.get(node)){
                            if(!vis[it]){
                                vis[it] = true;
                                q.add(it);
                            }
                        }
                    }
            }
        }

        return list;

    }

    public static ArrayList<Integer> dfs(int V, List<List<Integer>> adj){
        ArrayList<Integer> list = new ArrayList<>();

        boolean vis[] = new boolean[V+1];

        for(int i = 1; i <= V; i++){
            if(!vis[i]){
                dfsHelper(i, vis, adj, list);
            }
        }

        return list;
    }

    public static void dfsHelper(int node, boolean vis[], List<List<Integer>> adj, ArrayList<Integer> list){
        list.add(node);
        vis[node] = true;
        for(int i: adj.get(node)){
            if(!vis[node]) dfsHelper(i, vis, adj, list);
        }
    }
}
