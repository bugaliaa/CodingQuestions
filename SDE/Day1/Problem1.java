package SDE.Day1;

import java.util.Scanner;

// https://leetcode.com/problems/sort-colors/
// Dutch National Flag Algorithm

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++) nums[i] = sc.nextInt();
        sc.close();
        sortColors(nums);
        printArray(nums);
    }
    public static void sortColors(int[] nums) {
        int low = 0;
        int mid = low;
        int high = nums.length-1;
        while(mid <= high){
            if(nums[mid] == 0){
                swap(nums, mid, low);
                low++;
                mid++;
            }else if(nums[mid] == 1){
                mid++;
            }else{
                swap(nums, mid, high);
                high--;
            }
        }
    }
    public static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public static void printArray(int[] a){
        for(int i: a) System.out.print(i + " ");
        System.out.println();
    }
}
