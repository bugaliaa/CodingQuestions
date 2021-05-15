package SDE.Day14;

// https://leetcode.com/problems/sliding-window-maximum/
// Sliding Window Maximum

import java.util.*;

public class Problem4 {
    public static void main(String[] args) {
        int[] nums = {1,3,-1,-3,5,3,6,7};
        int[] ans = maxSlidingWindow(nums, 3);
        for(int i: ans) System.out.print(i + " ");
    }
    public static int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        if(n <= 0 || nums == null) return nums;
        int ans[] = new int[n-k+1];
        Deque<Integer> dq = new LinkedList<>();
        
        int i = 0;
        for(; i < k; i++){
            while(!dq.isEmpty() && nums[dq.peekLast()] <= nums[i]) dq.removeLast();
            dq.addLast(i);
        }
        for(; i < n; i++){
            ans[i-k] = nums[dq.peekFirst()];
            while(!dq.isEmpty() && dq.peekFirst() <= i-k) dq.removeFirst();
            while(!dq.isEmpty() && nums[dq.peekLast()] <= nums[i]) dq.removeLast();
            dq.addLast(i);
        }
        ans[i-k] = nums[dq.peekFirst()];
        return ans;
    }
}
