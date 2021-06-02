package SDE.Day24;

// https://leetcode.com/problems/network-delay-time/
// Network Delay Time | Dijkstra's Algorithm (LeetCode)

import java.util.*;

public class Problem3 {
    public int networkDelayTime(int[][] times, int n, int k) {
        Map<Integer, List<int[]>> map = new HashMap<>();
        for(int[] edge: times){
            map.putIfAbsent(edge[0], new ArrayList<>());
            map.get(edge[0]).add(new int[]{edge[1], edge[2]});
        }

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> (a[0] - b[0]));

        boolean[] vis = new boolean[n+1];
        int minDis[] = new int[n+1];
        Arrays.fill(minDis, Integer.MAX_VALUE);
        minDis[k] = 0;

        pq.add(new int[]{0, k});
        int max = 0;
        while(!pq.isEmpty()){
            int[] curr = pq.poll();
            int curNode = curr[1];
            int curDis = curr[0];
            if(!vis[curNode]){
                vis[curNode] = true;
                max = curDis;
                n--;
            }
            if(n == 0) return max;
            if(map.containsKey(curNode)){
                for(int[] next: map.get(curNode)){
                    if(curDis + next[1] < minDis[next[0]] && !vis[next[0]]){
                        pq.add(new int[]{curDis + next[1], next[0]});
                    }
                }
            }
        }
        return n == 0 ? max : -1;
    }
}
