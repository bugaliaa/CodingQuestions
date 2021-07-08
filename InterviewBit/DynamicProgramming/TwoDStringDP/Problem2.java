package InterviewBit.DynamicProgramming.TwoDStringDP;

// https://www.interviewbit.com/problems/longest-palindromic-subsequence/
// Longest Palindromic Subsequence

public class Problem2 {
    public int solve(String A) {
        String rev = reverseString(A);
        return lcs(A, rev);
    }
    public int lcs(String t1, String t2){
        int n = t1.length();
        int m = t2.length();

        int[][] dp = new int[n+1][m+1];

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= m; j++){
                if(t1.charAt(i-1) == t2.charAt(j-1)) dp[i][j] = dp[i-1][j-1]+1;
                else dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
            }
        }

        return dp[n][m];
    }
    public String reverseString(String X){
        char[] a = X.toCharArray();
        int l = 0;
        int r = a.length-1;
        while(l < r){
            char t = a[l];
            a[l] = a[r];
            a[r] = t;
            l++;
            r--;
        }

        return new String(a);
    }
}
