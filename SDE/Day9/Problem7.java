package SDE.Day9;

// https://leetcode.com/problems/permutation-sequence
// Permutation Sequencce (LeetCode)

import java.util.*;

public class Problem7 {
    public static void main(String[] args) {
        System.out.println(getPermutation(3, 3));
    }
    public static String getPermutation(int n, int k) {
        int fact = 1;
        List<Integer> numbers = new ArrayList<>();
        for(int i = 1; i < n; i++){
            fact = fact*i;
            numbers.add(i);
        }
        numbers.add(n);
        String ans = "";
        k--;
        while(true){
            ans = ans + numbers.get(k/fact);
            numbers.remove(k/fact);
            if(numbers.size() == 0) break;
            k = k%fact;
            fact = fact/numbers.size();
        }
        return ans;
    }
}
