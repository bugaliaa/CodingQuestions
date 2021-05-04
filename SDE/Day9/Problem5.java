package SDE.Day9;

import java.util.*;

// https://leetcode.com/problems/combination-sum-ii
// Combinations Sum II (LeetCode)

public class Problem5 {
    public static void main(String[] args) {
        int[] candidates = {10,1,2,7,6,1,5};
        int target = 8;

        List<List<Integer>> list = combinationSum2(candidates, target);

        for(List<Integer> i : list){
            for(int j: i) System.out.print(j + " ");
            System.out.println();
        }
    }
    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);
        helper(0, target, candidates, res, new ArrayList<>());
        return res;
    }
    public static void helper(int idx, int target, int candidates[], List<List<Integer>> res, List<Integer> curr){
        if(target == 0){
            res.add(new ArrayList<>(curr));
            return;
        }
        for(int i = idx; i < candidates.length; i++){
            if(i > idx && candidates[i] == candidates[i-1]) continue;
            if(candidates[i] > target) break;
            curr.add(candidates[i]);
            helper(i+1, target-candidates[i], candidates, res, curr);
            curr.remove(curr.size()-1);
        }
    }
}
