package SDE.Day10;

// https://leetcode.com/problems/permutations-ii/
// Permutations II (LeetCode)

import java.util.*;

public class Problem2 {
    public static void main(String[] args) {
        int[] nums = {1,1,2};
        List<List<Integer>> list = permuteUnique(nums);
        for(List<Integer> i: list){
            for(int j: i) System.out.print(j + " ");
            System.out.println();
        }
    }
    public static List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        helper(nums, new ArrayList<>(), ans, new boolean[nums.length]);
        return ans;
    }
    public static void helper(int[] nums, List<Integer> temp, List<List<Integer>> ans, boolean[] used){
        if(temp.size() == nums.length){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i = 0; i < nums.length; i++){
            if(used[i] || i > 0 && nums[i] == nums[i-1] && !used[i-1]) continue;
            temp.add(nums[i]);
            used[i] = true;
            helper(nums, temp, ans, used);
            used[i] = false;
            temp.remove(temp.size()-1);
        }
    }
}
