package SDE.Day16;

import java.util.*;

// Z Algorithm (GFG)
// https://www.geeksforgeeks.org/z-algorithm-linear-time-pattern-searching-algorithm/

public class Problem1 {
    public static void main(String[] args) {
        String text = "geeksforgeeks";
        String pattern = "geek";
        List<Integer> list = matchPattern(text, pattern);
        for(int i: list) System.out.print(i + " ");
    }
    public static List<Integer> matchPattern(String text, String pattern) {
        String newString = pattern + "$" + text;
        int z[] = zArr(newString);
        List<Integer> ans = new ArrayList<>();
        for(int i = 0; i < z.length; i++){
            if(z[i] == pattern.length()) ans.add(i-pattern.length()-1);
        }
        return ans;
    }
    public static int[] zArr(String newString){
        int l = newString.length();
        int[] z = new int[l];
        int left = 0;
        int right = 0;

        for(int i = 1; i < l; i++){
            if(i > right){
                left = right = i;
                while(right < l && newString.charAt(right-left) == newString.charAt(right)) right++;
                z[i] = right-left;
                right--;
            }else{
                int k = i - left;
                if(z[k] < right - i + 1) z[i] = z[k];
                else{
                    left = i;
                    while(right < l && newString.charAt(right-left) == newString.charAt(right)) right++;
                    z[i] = right-left;
                    right--;
                }
            }
        }
        return z;
    }
}
