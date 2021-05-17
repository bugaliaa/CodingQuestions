package SDE.Day15;

// https://leetcode.com/problems/palindromic-substrings/
// Palindromic Substrings

public class Problem2 {
    public static void main(String[] args) {
        String s = "aaa";
        System.out.println(countSubstrings(s));
    }
    public static int countSubstrings(String s) {
        int n = s.length();
        boolean[][] dp = new boolean[n][n];
        int count = 0;
        for(int gap = 0; gap < n; gap++){
            for(int i = 0, j = gap; j < n; j++, i++){
                if(gap == 0) dp[i][j] = true;
                else if(gap == 1) dp[i][j] = s.charAt(i) == s.charAt(j);
                else dp[i][j] = s.charAt(i) == s.charAt(j) && dp[i+1][j-1];

                if(dp[i][j]) count++;
            }
        }
        return count;
    }
}
