package InterviewBit.Backtracking.Subsets;

// https://www.interviewbit.com/problems/combination-sum-ii/
// Combination Sum II

import java.util.*;

public class Problem3 {
    public ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> a, int b) {
        Collections.sort(a);
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        helper(a, ans, new ArrayList<>(), b, 0);
        return ans;
    }
    public void helper(ArrayList<Integer> a, ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> temp, int target, int idx){
        if(target == 0){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i = idx; i < a.size(); i++){
            if(i > idx && a.get(i) == a.get(i-1)) continue;
            if(a.get(i) > target) break;
            temp.add(a.get(i));
            helper(a, ans, temp, target-a.get(i), i+1);
            temp.remove(temp.size()-1);
        }
    }
}
