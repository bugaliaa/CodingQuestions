package SDE.Day22;

// https://practice.geeksforgeeks.org/problems/count-distinct-elements-in-every-window/1
// Count distinct elements in every window (GFG)

import java.util.*;

public class Problem4 {
    ArrayList<Integer> countDistinct(int A[], int n, int k){
        ArrayList<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        int distinct = 0;
        for(int i = 0; i < n; i++){
            if(i >= k){
                map.put(A[i-k], map.getOrDefault(A[i-k], 0) - 1);
                if(map.get(A[i-k]) == 0) distinct--;
            }
            map.put(A[i], map.getOrDefault(A[i], 0)+1);
            if(map.get(A[i]) == 1) distinct++;
            if(i >= k-1) list.add(distinct);
        }

        return list;
    }
}
