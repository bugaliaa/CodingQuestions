package SDE.Day4;

// https://leetcode.com/problems/longest-substring-without-repeating-characters
// Longest Substring without Repeating Characters

import java.util.*;

public class Problem6 {
    public static void main(String[] args) {
        
    }
    public static int lengthOfLongestSubstring(String s) {
        int len = 0;
        Map<Character, Integer> map = new HashMap<>();
        int l = 0;
        int r = 0;
        
        while(r < s.length()){
            if(map.containsKey(s.charAt(r))) l = Math.max(map.get(s.charAt(r))+1, l);

            map.put(s.charAt(r), r);
            len = Math.max(r-l+1, len);
            r++;
        }

        return len;
    }
}
