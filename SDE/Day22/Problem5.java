package SDE.Day22;

// https://leetcode.com/problems/kth-largest-element-in-an-array/
// Kth Largest element in an array (LeetCode)

import java.util.*;

public class Problem5 {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(k);
        for(int i: nums){
            if(pq.size() < k) pq.add(i);
            else if(pq.peek() < i){
                pq.poll();
                pq.add(i);
            }
        }
        return pq.peek();
    }
}
