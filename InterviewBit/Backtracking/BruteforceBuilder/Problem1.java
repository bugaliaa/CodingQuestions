package InterviewBit.Backtracking.BruteforceBuilder;

// https://www.interviewbit.com/problems/letter-phone/
// Letter Phone

import java.util.*;

public class Problem1 {
    public ArrayList<String> letterCombinations(String A) {
        String key[] = {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        ArrayList<String> ans = new ArrayList<>();
        helper(ans, A, key, "", 0);
        return ans;
    }
    public void helper(ArrayList<String> ans, String A, String[] key, String temp, int idx){
        if(idx == A.length()){
            ans.add(temp);
            return;
        }

        int d = A.charAt(idx) - '0';

        for(int i = 0; i < key[d].length(); i++){
            temp += key[d].charAt(i);
            helper(ans, A, key, temp, idx+1);
            temp = temp.substring(0, temp.length()-1);
        }
    }
}
// 223