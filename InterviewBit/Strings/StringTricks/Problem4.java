package InterviewBit.Strings.StringTricks;

// https://www.interviewbit.com/problems/longest-palindromic-substring/
// Longest Palindromic Substring

public class Problem4 {
    public String longestPalindrome(String A) {
        int max = 0;
        int n = A.length();
        String ans = "";
        boolean[][] dp = new boolean[n][n];

        for(int g = 0; g < n; g++){
            for(int i = 0, j = g; j < n; j++, i++){
                if(g == 0) dp[i][j] = true;
                else if(g == 1) dp[i][j] = A.charAt(i) == A.charAt(j);
                else{
                    dp[i][j] = A.charAt(i) == A.charAt(j) && dp[i+1][j-1];
                }
                if(dp[i][j]){
                    if(j-i+1 > max){
                        max = j-i+1;
                        ans = A.substring(i, j+1);
                    }
                }
            }
        }

        return ans;
    }
}
