package SDE.Day22;

import java.util.*;

// https://leetcode.com/problems/find-median-from-data-stream/
// Find median from data stream.Median Priority Queue (LeetCode)

public class Problem2 {
    /** initialize your data structure here. */
    private PriorityQueue<Integer> left;
    private PriorityQueue<Integer> right;
    private boolean even;
    
    public Problem2() {
        left = new PriorityQueue<>(Collections.reverseOrder());
        right = new PriorityQueue<>();
        even = true;
    }
    
    public void addNum(int num) {
        if(even){
            right.add(num);
            left.add(right.poll());
        }else{
            left.add(num);
            right.add(left.poll());
        }
        even = !even;
    }
    
    public double findMedian() {
        if(even){
            return (left.peek() + right.peek()) /2.0;
        }else{
            return left.peek();
        }
    }
}
