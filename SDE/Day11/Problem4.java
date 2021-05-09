package SDE.Day11;

// https://leetcode.com/problems/search-in-rotated-sorted-array
// Search in a sorted array (LeetCode)

public class Problem4 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        System.out.println(search(nums, 2));
    }
    public static int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length-1;

        while(l < r){
            int m = (l+r)/2;
            if(nums[m] > nums[r]) l = m+1;
            else r = m;
        }
        int start = l;
        l = 0;
        r = nums.length-1;
        if(target >= nums[start] && nums[r] >= target) l = start;
        else r = start;
        
        while(l <= r){
            int m = (l+r)/2;
            if(nums[m] == target) return m;
            if(nums[m] < target) l = m+1;
            else r = m-1;
        }
        return -1;
    }
}
