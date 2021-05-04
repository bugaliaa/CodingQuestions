package SDE.Day9;

import java.util.*;

// https://leetcode.com/problems/palindrome-partitioning/
// Palindrome Partitioning (LeetCode)

public class Problem6 {
    public static void main(String[] args) {
        String s = "aab";
        List<List<String>> ans = partition(s);
        for(List<String> i: ans){
            for(String j: i) System.out.print(j + " ");
            System.out.println();
        }
    }
    public static List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        helper(s, 0, new ArrayList<>(), res);
        return res;
    }
    public static void helper(String s, int idx, List<String> set, List<List<String>> res){
        if(idx == s.length()){
            res.add(new ArrayList<>(set));
            return;
        }
        for(int i = idx; i < s.length(); i++){
            if(isPalindrome(s, idx, i)){
                set.add(s.substring(idx, i+1));
                helper(s, i+1, set, res);
                set.remove(set.size()-1);
            }
        }
    }
    public static boolean isPalindrome(String temp, int start, int end){
        while(start <= end){
            if(temp.charAt(start++) != temp.charAt(end--)) return false;
        }
        return true;
    }
}
