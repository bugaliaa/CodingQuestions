package SDE.Day16;

// https://practice.geeksforgeeks.org/problems/longest-prefix-suffix2527/1#
// Longest Prefix Suffix (GFG)

public class Problem2 {
    public static void main(String[] args) {
        String s = "kkkk";
        System.out.println(lps(s));
    }
    public static int lps(String s) {
        int n = s.length();
        int lps[] = new int[n];
        int i = 1;
        int j = 0;
        lps[0] = 0;
        while(i < n){
            if(s.charAt(i) == s.charAt(j)){ 
                j++;
                lps[i] = j;
                i++;
            }else {
                if(j != 0) j = lps[j-1];
                else{
                    lps[i] = 0;
                    i++;
                }
            }
        }
        int res = 0;
        for(int k = 0; k < n; k++) res = Math.max(res, lps[k]);
        return res;
    }
}
