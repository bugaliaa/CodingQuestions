package InterviewBit.Backtracking.BruteforceBuilder;

// https://www.interviewbit.com/problems/palindrome-partitioning/
// Palindrome Partitioning

import java.util.*;

public class Problem2 {
    public ArrayList<ArrayList<String>> partition(String a) {
        ArrayList<ArrayList<String>> ans = new ArrayList<>();
        helper(a, ans, new ArrayList<>(), 0);
        return ans;
    }
    public void helper(String a, ArrayList<ArrayList<String>> ans, ArrayList<String> temp, int idx){
        if(idx == a.length()){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i = idx; i < a.length(); i++){
            if(isPalin(a, idx, i)){
                temp.add(a.substring(idx, i+1));
                helper(a, ans, temp, i+1);
                temp.remove(temp.size()-1);
            }
        }
    }
    public boolean isPalin(String s, int l, int r){
        while(l <= r){
            if(s.charAt(l) != s.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }
}
