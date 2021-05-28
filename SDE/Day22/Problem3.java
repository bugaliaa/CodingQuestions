package SDE.Day22;

import java.util.*;

// https://leetcode.com/problems/kth-largest-element-in-a-stream/
// Kth larges element in a stream (LeetCode)

public class Problem3 {
    private PriorityQueue<Integer> pq;
    private int k;
    
    public Problem3(int k, int[] nums) {
        pq = new PriorityQueue<>(k);
        this.k = k;
        for(int i: nums) add(i);
    }
    
    public int add(int val) {
        if(pq.size() < k) pq.add(val);
        else if(pq.peek() < val){
            pq.poll();
            pq.add(val);
        }
        return pq.peek();
    }
}
