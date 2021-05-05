package SDE.Day10;

// https://leetcode.com/problems/permutations/
// Permutations of a array/string (LeetCode)

import java.util.*;

public class Problem1 {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        List<List<Integer>> list = permute(nums);
        for(List<Integer> i: list){
            for(int j: i) System.out.print(j + " ");
            System.out.println();
        }
    }
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(nums, new ArrayList<>(), ans);
        return ans;
    }
    public static void helper(int[] nums, List<Integer> temp, List<List<Integer>> ans){
        if(temp.size() == nums.length){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i = 0; i < nums.length; i++){
            if(temp.contains(nums[i])) continue;
            temp.add(nums[i]);
            helper(nums, temp, ans);
            temp.remove(temp.size()-1);
        }
    }
}

