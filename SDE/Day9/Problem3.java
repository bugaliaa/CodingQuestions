package SDE.Day9;

import java.util.*;

// https://leetcode.com/problems/subsets-ii/
// Subsets II (Leetcode)

public class Problem3 {
    public static void main(String[] args) {
        int[] nums = {1,2,2};
        List<List<Integer>> list = subsetsWithDup(nums);
        for(List<Integer> i: list){
            for(int j: i) System.out.print(j + " ");
            System.out.println();
        }
    }
    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> subsets = new ArrayList<>();
        helper(0, nums, subsets, new ArrayList<>());
        return subsets;
    }
    public static void helper(int i, int[] nums, List<List<Integer>> subsets, List<Integer> current){
        subsets.add(new ArrayList<>(current));

        for(int j = i; j < nums.length; j++){
            if(j != i && nums[j] == nums[j-1]) continue;
            current.add(nums[j]);
            helper(j+1, nums, subsets, current);
            current.remove(current.size()-1);
        }
    }
}
