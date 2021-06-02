package SDE.Day24;

// https://leetcode.com/problems/min-cost-to-connect-all-points/
// Minimum Cost to connect all points | MST (LeetCode)

import java.util.*;

public class Problem5 {
    public int minCostConnectPoints(int[][] points) {
        int n = points.length, ans = 0;

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> (a[0] - b[0]));

        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                pq.add(new int[]{findDist(points, i, j), i, j});
            }
        }

        int count = 0;
        UnionFind uf = new UnionFind(n);

        while(count < n-1){
            int[] temp = pq.poll();
            if(uf.find(temp[1]) != uf.find(temp[2])){
                ans += temp[0];
                count++;
                uf.union(temp[1], temp[2]);
            }
        }

        return ans;
    }

    class UnionFind{
        int[] parent;
        UnionFind(int n){
            parent = new int[n];
            for(int i = 0; i < n; i++) parent[i] = i;
        }
        public int find(int x){
            if(parent[x] == x) return x;
            return parent[x] = find(parent[x]);
        }
        public void union(int a, int b){
            parent[find(a)] = parent[find(b)];
        }
    }

    public int findDist(int[][] points, int a, int b){
        return Math.abs(points[a][0] - points[b][0]) + Math.abs(points[a][1] - points[b][1]);
    }
}
