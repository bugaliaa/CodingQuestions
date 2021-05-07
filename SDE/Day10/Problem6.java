package SDE.Day10;

import java.util.*;

// https://leetcode.com/problems/word-break/
// Word Break (LeetCode)

public class Problem6 {
    public static void main(String[] args) {
        List<String> wordDict = Arrays.asList("leet", "code");
        String s = "leetcode";
        System.out.println(wordBreak(s, wordDict));
    }
    public static boolean wordBreak(String s, List<String> wordDict) {
        Set<String> set = new HashSet<>(wordDict);
        return helper(s, set);
    }
    public static boolean helper(String s, Set<String> set){
        boolean[] table = new boolean[s.length()+1];
        table[0] = true;

        for(int i = 1; i <= s.length(); i++){
            for(int j = 0; j < i; j++){
                if(table[j] && set.contains(s.substring(j, i))){
                    table[i] = true;
                    break;
                }
            }
        }
        return table[s.length()];
    }
}
