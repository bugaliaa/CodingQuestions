package InterviewBit.Backtracking.Subsets;

// https://www.interviewbit.com/problems/subset/
// Subset

import java.util.*;

public class Problem1 {
    public ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> a) {
        Collections.sort(a);
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        helper(a, ans, new ArrayList<>(), 0);
        return ans;
    }
    public void helper(ArrayList<Integer> a, ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> temp, int idx){
        ans.add(new ArrayList<>(temp));

        for(int i = idx; i < a.size(); i++){
            temp.add(a.get(i));
            helper(a, ans, temp, i+1);
            temp.remove(temp.size()-1);
        }
    }
}
