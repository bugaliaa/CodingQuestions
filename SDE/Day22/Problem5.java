package SDE.Day22;

import java.util.Random;

// https://leetcode.com/problems/kth-largest-element-in-an-array/
// Kth Largest element in an array (LeetCode)

public class Problem5 {
    public int findKthLargest(int[] nums, int k) {
        int n = nums.length;
        int left = 0;
        int right = n-1;

        Random rand = new Random(0);

        while(left <= right){
            int pivotIndex = rand.nextInt(right - left + 1) + left;
            int finalIndex = partition(nums, pivotIndex, left, right);

            if(finalIndex == n - k) return nums[finalIndex];
            else if(finalIndex > n - k) right = finalIndex-1;
            else left = finalIndex+1;
        }

        return -1;
    }
    public int partition(int[] nums, int pivot, int left, int right){
        int pivotValue = nums[pivot];
        int lesserItemTailIndex = left;

        swap(nums, pivot, right);

        for(int i = left; i < right; i++){
            if(nums[i] < pivotValue){
                swap(nums, i, lesserItemTailIndex);
                lesserItemTailIndex++;
            }
        }

        swap(nums, right, lesserItemTailIndex);

        return lesserItemTailIndex;
    }
    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
