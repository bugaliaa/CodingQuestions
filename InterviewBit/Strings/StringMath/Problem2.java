package InterviewBit.Strings.StringMath;

// https://www.interviewbit.com/problems/roman-to-integer/
// Roman to Integer

import java.util.*;

public class Problem2 {
    public int romanToInt(String A) {
        int n = A.length();
        int ans = 0;
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        ans += map.get(A.charAt(n-1));
        for(int i = n-2; i >= 0; i--){
            if(map.get(A.charAt(i)) < map.get(A.charAt(i+1))) ans -= map.get(A.charAt(i));
            else ans += map.get(A.charAt(i));
        }

        return ans;
    }
}
