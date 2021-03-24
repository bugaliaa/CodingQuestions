package SDE.Day1;

// https://leetcode.com/problems/find-the-duplicate-number
// Find the Duplicate Number

import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n+1];
        for(int i = 0; i < n+1; i++) nums[i] = sc.nextInt();
        sc.close();
        System.out.println(findDuplicate(nums));
    }
    public static int findDuplicate(int[] nums) {

        int tortoise = nums[0];
        int hare = nums[0];
        do{
            hare = nums[nums[hare]];
            tortoise = nums[tortoise];
        }
        while(tortoise != hare);
        hare = nums[0];
        while(tortoise != hare){
            tortoise = nums[tortoise];
            hare = nums[hare];
        }
        return tortoise;
    }
}
