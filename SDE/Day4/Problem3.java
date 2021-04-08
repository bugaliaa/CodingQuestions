package SDE.Day4;

// Longest Common Subsequence
// https://leetcode.com/problems/longest-consecutive-sequence/

import java.util.*;

public class Problem3 {
    public static void main(String[] args) {
        int[] nums = {100, 4, 101, 2, 1, 3};
        System.out.println(longestConsecutive(nums));
    }
    public static int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int maxLength = 0;
        for(int i: nums) set.add(i);
        for(int i: nums){
            if(!set.contains(i-1)){
                int currNum = i;
                int length = 1;
                while(set.contains(currNum+1)){
                    currNum++;
                    length++;
                }
                maxLength = Math.max(maxLength, length);
            }
        }
        return maxLength;
    }    
}
