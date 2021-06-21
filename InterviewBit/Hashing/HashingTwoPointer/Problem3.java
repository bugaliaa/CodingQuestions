package InterviewBit.Hashing.HashingTwoPointer;

// https://www.interviewbit.com/old/problems/longest-substring-without-repeat/
// Longest Substring without Repeat

import java.util.*;

public class Problem3 {
    public int lengthOfLongestSubstring(String A) {
        int len = 0;
        int l = 0;
        int r = 0;

        Map<Character, Integer> map = new HashMap<>();

        while(r < A.length()){
            if(map.containsKey(A.charAt(r))) l = Math.max(map.get(A.charAt(r))+1, l);

            map.put(A.charAt(r), r);
            len = Math.max(r-l+1, len);
            r++;
        }
        return len;
    }
}
