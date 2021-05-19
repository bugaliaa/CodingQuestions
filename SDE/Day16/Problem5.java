package SDE.Day16;

// https://practice.geeksforgeeks.org/problems/minimum-deletitions1648/1
// Minimum deletions to make a string palindrome (GFG)

public class Problem5 {
    public static void main(String[] args) {
        String s = "aebcbda";
        System.out.println(minimumNumberOfDeletions(s));
    }
    public static int minimumNumberOfDeletions(String s) {
        String rev = reverse(s);
        return s.length() - lcs(s, rev);
    }
    public static String reverse(String s){
        char[] c = s.toCharArray();
        int i = 0;
        int j = c.length-1;
        while(i < j){
            char t = c[i];
            c[i] = c[j];
            c[j] = t;
            i++;
            j--;
        }

        return new String(c);
    }
    public static int lcs(String text1, String text2){
        int n = text1.length();
        int m = text2.length();
        int[][] dp = new int[n+1][m+1];
        for(int i = 1; i < n+1; i++){
            for(int j = 1; j < m+1; j++){
                if(text1.charAt(i-1) == text2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1]+1;
                }else{
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        return dp[n][m];
    }
}
