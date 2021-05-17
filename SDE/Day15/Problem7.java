package SDE.Day15;

// https://leetcode.com/problems/longest-common-prefix/
// Longest Common Prefix (LeetCode)

import java.util.*;

public class Problem7 {
    public static void main(String[] args) {
        String[] s = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(s));
    }
    public static String longestCommonPrefix(String[] s) {
        int n = s.length;
        if(n == 0) return "";
        if(n == 1) return s[0];

        Arrays.sort(s);
        int end = Math.min(s[0].length(), s[n-1].length());

        int i = 0;
        while(i < end && s[0].charAt(i) == s[n-1].charAt(i)) i++;

        return s[0].substring(0, i);
    }
}
