package SDE.Day14;

// https://leetcode.com/problems/largest-rectangle-in-histogram
// Largest Rectangle in Histogram

import java.util.*;

public class Problem3 {
    public static void main(String[] args) {
        int[] heights = {2,1,5,6,2,3};
        System.out.println(largestRectangleArea(heights));
    }
    public static int largestRectangleArea(int[] heights) {
        int lb[] = nextSmallerElementLeft(heights);
        int rb[] = nextSmallerElementRight(heights);

        int maxArea = 0;
        for(int i = 0; i < heights.length; i++){
            int width = rb[i] - lb[i] - 1;
            int area = width*heights[i];
            maxArea = Math.max(maxArea, area);
        }
        return maxArea;
    }
    public static int[] nextSmallerElementLeft(int nums[]){
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[nums.length];
        ans[0] = -1;
        stack.push(0);
        for(int i = 1; i < ans.length; i++){
            while(!stack.empty() && nums[i] <= nums[stack.peek()]) stack.pop();
            ans[i] = stack.empty() ? -1 : stack.peek();
            stack.push(i);
        }
        return ans;
    }
    public static int[] nextSmallerElementRight(int nums[]){
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[nums.length];
        ans[ans.length-1] = nums.length;
        stack.push(ans.length-1);
        for(int i = ans.length-2; i >= 0; i--){
            while(!stack.empty() && nums[i] <= nums[stack.peek()]) stack.pop();
            ans[i] = stack.empty() ? nums.length : stack.peek();
            stack.push(i);
        }
        return ans;
    }
}
