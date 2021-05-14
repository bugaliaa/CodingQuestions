package SDE.Day13;

// https://leetcode.com/problems/next-greater-element-i
// Next Greater Element I (LEETCODE)

import java.util.*;

public class Problem10 {
    public static void main(String[] args) {
        int nums1[] = {1,3,5,2,4};
        int nums2[] = {6,5,4,3,2,1,7};

        int[] t = nextGreaterElement(nums1, nums2);
        for(int i: t) System.out.print(i + " ");
    }
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] t = nger(nums2);
        Map<Integer, Integer> map = new HashMap<>();
        int ans[] = new int[nums1.length];

        for(int i = 0; i < nums2.length; i++){
            map.put(nums2[i], t[i]);
        }
        for(int i = 0; i < nums1.length; i++){
            ans[i] = map.get(nums1[i]);
        }
        return ans;
    }
    public static int[] nger(int[] a){
        int ans[] = new int[a.length];
        Stack<Integer> stack = new Stack<>();
        stack.push(a[a.length-1]);
        ans[a.length-1] = -1;
        for(int i = a.length-2; i >= 0; i--){
            while(!stack.empty() && a[i] > stack.peek()) stack.pop();
            ans[i] = stack.empty() ? -1 : stack.peek();
            stack.push(a[i]);
        }
        return ans;
    }
}
