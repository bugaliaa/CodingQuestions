package SDE.Day16;

// https://www.geeksforgeeks.org/kmp-algorithm-for-pattern-searching/
// KMP Algorithm for String matching (GFG)

import java.util.*;

public class Problem3 {
    public static void main(String[] args) {
        String s = "ABABDABACDABABCABAB";
        String pat = "ABABCABAB";
        List<Integer> ans = KMPSearch(s, pat);
        for(int i: ans) System.out.print(i + " ");
    }
    public static int[] lspArray(String s){
        int n  = s.length();
        int[] lps = new int[n];
        int i = 1;
        int j = 0;
        lps[0] = 0;
        while(i < n){
            if(s.charAt(i) == s.charAt(j)){
                j++;
                lps[i] = j;
                i++;
            }else{
                if(j != 0) j = lps[j-1];
                else{
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }
    public static List<Integer> KMPSearch(String s, String pat){
        int m = pat.length();
        int n = s.length();

        int i = 0;
        int j = 0;
        int[] lps = lspArray(pat);
        List<Integer> list = new ArrayList<>();

        while(i < n){
            if(pat.charAt(j) == s.charAt(i)){
                i++;
                j++;
            }
            if(j == m){
                list.add(i-j);
                j = lps[j-1];
            }else if(i < n && pat.charAt(j) != s.charAt(i)){
                if(j != 0){
                    j = lps[j-1];
                }else{
                    i = i+1;
                }
            }
        }
        return list;
    }
}
