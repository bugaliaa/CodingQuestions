package InterviewBit.Backtracking.Permutations;

// https://www.interviewbit.com/problems/permutations/
// Permutations

import java.util.*;

public class Problem1 {
    public ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> A) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        helper(A, new ArrayList<>(), ans);
        return ans;
    }
    public void helper(ArrayList<Integer> A, ArrayList<Integer> temp, ArrayList<ArrayList<Integer>> ans){
        if(temp.size() == A.size()){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i = 0; i < A.size(); i++){
            if(temp.contains(A.get(i))) continue;
            temp.add(A.get(i));
            helper(A, temp, ans);
            temp.remove(temp.size()-1);
        }
    }
}
