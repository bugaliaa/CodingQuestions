package InterviewBit.Backtracking.BruteforceBuilder;

// https://www.interviewbit.com/problems/generate-all-parentheses-ii/
// Generate All Parentheses II

import java.util.*;

public class Problem3 {
    public ArrayList<String> generateParenthesis(int n) {
        ArrayList<String> ans = new ArrayList<>();
        helper(n, 0, 0, 0, ans, new char[2*n]);
        Collections.sort(ans);
        return ans;
    }
    public void helper(int n, int opening, int closing, int pos, ArrayList<String> ans, char[] temp){
        if(closing == n){
            ans.add(new String(temp));
            return;
        }
        if(opening > closing){
            temp[pos] = ')';
            helper(n, opening, closing+1, pos+1, ans, temp);
        }
        if(opening < n){
            temp[pos] = '(';
            helper(n, opening+1, closing, pos+1, ans, temp);
        }
    }
}
