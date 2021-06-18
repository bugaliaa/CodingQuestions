package InterviewBit.Backtracking.Subsets;

// https://www.interviewbit.com/problems/combination-sum/
// Combination Sum

import java.util.*;

public class Problem2 {
    public ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> A, int B) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        Set<Integer> set = new HashSet<>(A);
        A.clear();
        A.addAll(set);
        Collections.sort(A);
        helper(A, new ArrayList<>(), ans, B, 0);
        return new ArrayList<>(ans);
    }
    public void helper(ArrayList<Integer> A, ArrayList<Integer> temp, ArrayList<ArrayList<Integer>> ans, int target, int idx){
        if(idx == A.size()){
            if(target == 0) ans.add(new ArrayList<>(temp));
            return;
        }
        if(A.get(idx) <= target){
            temp.add(A.get(idx));
            helper(A, temp, ans, target-A.get(idx), idx);
            temp.remove(temp.size()-1);
        }
        helper(A, temp, ans, target, idx+1);
    }
}
