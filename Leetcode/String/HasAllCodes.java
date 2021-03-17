package Leetcode.String;

import java.util.*;

public class HasAllCodes {
    public static void main(String[] args) {
        String s = "00110110";
        int k = 2;
        System.out.println(hasAllCodes(s, k));
    }
    public static boolean hasAllCodes(String s, int k){
        Set<String> set = new HashSet<>();
        for(int i = 0; i+k <= s.length(); i++){
            set.add(s.substring(i, i+k));
        }
        return (set.size() == (1 << k));
    }
}
