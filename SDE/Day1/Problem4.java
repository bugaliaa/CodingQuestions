package SDE.Day1;

// https://leetcode.com/problems/maximum-subarray/
// Maximum Subarray Sum (Kadane's Algorithm)

import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for(int i = 0; i < n; i++) nums[i] = sc.nextInt();
        sc.close();
        System.out.println(maxSubArray(nums));
    }

    public static int maxSubArray(int[] nums) {
        int globalMax = nums[0];
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            globalMax = Math.max(sum, globalMax);
            if(sum < 0) sum = 0;
        }
        return globalMax;
    }
}
