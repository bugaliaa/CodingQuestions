package SDE.Day4;

// Longest Subarray With 0 Sum
// https://practice.geeksforgeeks.org/problems/largest-subarray-with-0-sum/1

import java.util.*;

public class Problem4 {
    public static void main(String[] args) {
        int arr[] = {15,-2,2,-8,1,7,10,23};
        System.out.println(maxLen(arr, arr.length));
    }
    public static int maxLen(int arr[], int n) {
        int maxLength = 0;
        int sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            sum += arr[i];
            if(sum == 0){
                maxLength = i+1;
            }else{
                if(!map.containsKey(sum)) map.put(sum, i);
                else{
                    maxLength = Math.max(maxLength, i - map.get(sum));
                }
            }
        }
        return maxLength;
    }
}
