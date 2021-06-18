package InterviewBit.Backtracking.Subsets;

// https://www.interviewbit.com/problems/combinations/
// Combinations

import java.util.*;

public class Problem4 {
    public ArrayList<ArrayList<Integer>> combine(int n, int k) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        helper(n, k, ans, new ArrayList<>(), 1);
        return ans;
    }
    public void helper(int n, int k, ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> temp, int idx){
        if(temp.size() == k){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i = idx; i <= n; i++){
            temp.add(i);
            helper(n, k, ans, temp, i+1);
            temp.remove(temp.size()-1);
        }
    }
}
