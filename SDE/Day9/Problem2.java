package SDE.Day9;

// https://leetcode.com/problems/subsets-i/
// Subsets I (LeetCode)

import java.util.*;

public class Problem2 {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        List<List<Integer>> list = subsets(nums);
        for(List<Integer> i: list){
            for(int j: i) System.out.print(j + " ");
            System.out.println();
        }
    }
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(nums, ans, new ArrayList<>(), 0);
        return ans;
    }
    public static void helper(int[] nums, List<List<Integer>> ans, List<Integer> curr, int idx){
        ans.add(new ArrayList<>(curr));

        for(int i = idx; i < nums.length; i++){
            curr.add(nums[i]);
            helper(nums, ans, curr, i+1);
            curr.remove(curr.size()-1);
        }
    }
}
