package SDE.Day15;

// https://leetcode.com/problems/longest-palindromic-substring/
// Longest Palindromic substring (LeetCode)

public class Problem3 {
    public static void main(String[] args) {
        String s = "ac";
        System.out.println(longestPalindrome(s));
    }
    public static String longestPalindrome(String s) {
        int n = s.length();
        boolean[][] dp = new boolean[n][n];
        String ans = "";
        int max = 0;

        for(int gap = 0; gap < n; gap++){
            for(int i = 0, j = gap; j < n; i++, j++){
                if(gap == 0) dp[i][j] = true;
                else if(gap == 1) dp[i][j] = s.charAt(i) == s.charAt(j);
                else dp[i][j] = s.charAt(i) == s.charAt(j) && dp[i+1][j-1];

                if(dp[i][j]){
                    if(j-i+1 > max){
                        max = j-i+1;
                        ans = s.substring(i, j+1);
                    }
                }
            }
        }
        return ans;
    }
}
