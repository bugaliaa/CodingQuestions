package SDE.Day11;

// https://leetcode.com/problems/single-element-in-a-sorted-array
// Single element in a sorted array (LeetCode)

public class Problem3 {
    public static void main(String[] args) {
        int nums[] = {3,3,7,7,10,11,11};
        System.out.println(singleNonDuplicate(nums));
    }
    public static int singleNonDuplicate(int[] nums) {
        int start = 0;
        int end = nums.length-1;

        while(start < end){
            int mid = start + (end - start)/2;
            if(nums[mid] != nums[mid-1] && nums[mid] != nums[mid+1]) return nums[mid];
            if(mid%2 == 0){
                if(nums[mid] == nums[mid-1]){
                    end = mid;
                }else{
                    start = mid;
                }
            }else{
                if(nums[mid] == nums[mid-1]){
                    start = mid+1;
                }else{
                    end = mid-1;
                }
            }
        }
        return nums[start];
    }
}
