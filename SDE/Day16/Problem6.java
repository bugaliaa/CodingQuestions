package SDE.Day16;

// https://leetcode.com/problems/minimum-insertion-steps-to-make-a-string-palindrome/
// Minimum insertions steps to make a string palindrome (LeetCode)

public class Problem6 {
    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(minInsertions(s));
    }
    public static int minInsertions(String s) {
        String rev_s = reverse(s);
        return s.length() - lcs(s, rev_s); 
    }
    public static String reverse(String s){
        char c[] = s.toCharArray();
        int i = 0;
        int j = s.length()-1;
        while(i < j){
            char t = c[i];
            c[i] = c[j];
            c[j] = t;
            i++;
            j--;
        }
        return new String(c);
    }
    public static int lcs(String t1, String t2){
        int n = t1.length();
        int m = t2.length();
        int[][] dp = new int[n+1][m+1];
        for(int i = 1; i < n+1; i++){
            for(int j = 1; j < m+1; j++){
                if(t1.charAt(i-1) == t2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1]+1;
                }else{
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        return dp[n][m];
    }
}
