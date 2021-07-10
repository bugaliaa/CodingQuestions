package InterviewBit.DynamicProgramming.TwoDStringDP;

// https://www.interviewbit.com/problems/distinct-subsequences/
// Distinct Subsequences

public class Problem5 {
    public int numDistinct(String S, String T) {
        int m = T.length();
        int n = S.length();

        if(m > n) return 0;

        int[][] dp = new int[m+1][n+1];

        for(int i = 1; i <= m; i++) dp[i][0] = 0;

        for(int j = 0; j <= n; j++) dp[0][j] = 1;

        for(int i = 1; i <= m; i++){
            for(int j = 1; j <= n; j++){
                if(T.charAt(i-1) == S.charAt(j-1)) dp[i][j] = dp[i][j-1] + dp[i-1][j-1];
                else dp[i][j] = dp[i][j-1];
            }
        }

        return dp[m][n];
    }
}
