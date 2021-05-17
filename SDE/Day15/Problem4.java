package SDE.Day15;

// https://leetcode.com/problems/roman-to-integer/
// Roman to Integer (LeetCode)

import java.util.*;

public class Problem4 {
    public static void main(String[] args) {
        String s = "IX";
        System.out.println(romanToInt(s));
    }
    public static int romanToInt(String s) {
        int n = s.length();
        int ans = 0;
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        ans += map.get(s.charAt(n-1));
        for(int i = n-2; i >= 0; i--){
            if(map.get(s.charAt(i)) < map.get(s.charAt(i+1))) ans -= map.get(s.charAt(i));
            else ans += map.get(s.charAt(i));
        }

        return ans;
    }
}
