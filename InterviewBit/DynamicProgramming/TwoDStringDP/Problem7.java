package InterviewBit.DynamicProgramming.TwoDStringDP;

// https://www.interviewbit.com/problems/regular-expression-match/
// Regular Expression Match

public class Problem7 {
    public int isMatch(final String A, final String B) {
        int n = A.length();
        int m = B.length();

        if(m == 0) return n == 0 ? 1 : 0;

        boolean[][] dp = new boolean[n+1][m+1];

        dp[0][0] = true;

        for(int j = 1; j <= m; j++){
            if(B.charAt(j-1) == '*') dp[0][j] = dp[0][j-1];
        }

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= m; j++){
                if(B.charAt(j-1) == '*') dp[i][j] = dp[i][j-1] || dp[i-1][j];
                else if(B.charAt(j-1) == '?' || A.charAt(i-1) == B.charAt(j-1)) dp[i][j] = dp[i-1][j-1];
                else dp[i][j] = false;
            }
        }

        return dp[n][m] ? 1 : 0;
    }
}
