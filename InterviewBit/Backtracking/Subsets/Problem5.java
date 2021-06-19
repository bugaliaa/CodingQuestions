package InterviewBit.Backtracking.Subsets;

// https://www.interviewbit.com/problems/subsets-ii/
// Subsets ii

import java.util.*;

public class Problem5 {
    public ArrayList<ArrayList<Integer>> subsetsWithDup(ArrayList<Integer> A) {
        Collections.sort(A);
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        helper(A, ans, new ArrayList<>(), 0);
        return ans;
    }
    public void helper(ArrayList<Integer> A, ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> temp, int idx){
        ans.add(new ArrayList<>(temp));

        for(int i = idx; i < A.size(); i++){
            if(i != idx && A.get(i) == A.get(i-1)) continue;
            temp.add(A.get(i));
            helper(A, ans, temp, i+1);
            temp.remove(temp.size()-1);
        }
    }
}
