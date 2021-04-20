package SDE.Day7;

// https://leetcode.com/problems/remove-duplicates-from-sorted-array
// Remove Duplicates from Sorted Array

public class Problem4 {
    public static void main(String[] args) {
        int nums[] = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
    }
    public static int removeDuplicates(int[] nums) {
        if(nums.length == 0 || nums == null) return 0;
        int i = 0;
        for(int j = 1; j < nums.length; j++){
            if(nums[j] != nums[i]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }
}
