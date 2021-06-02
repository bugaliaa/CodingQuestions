package SDE.Day24;

import java.util.*;

// https://leetcode.com/problems/min-cost-to-connect-all-points/
// Minimum Cost to connect all points | MST Prim's (LeetCode)

public class Problem6 {
    public int minCostConnectPoints(int[][] points) {
        int ans = 0, n = points.length;
        Set<Integer> mst = new HashSet<>();
        mst.add(0);
        int dist[] = new int[n];

        for(int i = 0; i < n; i++){
            dist[i] = findDist(points, 0, i);
        }

        while(mst.size() != n){
            int next = -1;
            for(int i = 0; i < n; i++){
                if(!mst.contains(i)){
                    if(next == -1 || dist[next] > dist[i]) next = i;
                }
            }

            mst.add(next);
            ans += dist[next];

            for(int i = 0; i < n; i++){
                if(!mst.contains(i)){
                    dist[i] = Math.min(dist[i], findDist(points, i, next));
                }
            }
        }

        return ans;
    }
    public int findDist(int[][] points, int a, int b){
        return Math.abs(points[a][0] - points[b][0]) + Math.abs(points[a][1] - points[b][1]);
    }
}
