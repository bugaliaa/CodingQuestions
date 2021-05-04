package SDE.Day9;

import java.util.*;

// https://leetcode.com/problems/combination-sum/
// Combination Sum (LeetCode)

public class Problem4 {
    public static void main(String[] args) {
        int[] candidates = {2,3,6,7};
        int target = 7;
        List<List<Integer>> list = combinationSum(candidates, target);

        for(List<Integer> i: list){
            for(int j: i) System.out.print(j + " ");
            System.out.println();
        }
    }
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        helper(0, target, candidates, new ArrayList<>(), list);
        return list;
    }
    public static void helper(int idx, int target, int[] candidates, List<Integer> current, List<List<Integer>> list){
        if(idx == candidates.length){
            if(target == 0) list.add(new ArrayList<>(current));
            return;
        }
        if(candidates[idx] <= target){
            current.add(candidates[idx]);
            helper(idx, target-candidates[idx], candidates, current, list);
            current.remove(current.size()-1);
        }
        helper(idx+1, target, candidates, current, list);
    }
}
