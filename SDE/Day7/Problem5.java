package SDE.Day7;

// https://leetcode.com/problems/max-consecutive-ones/
// Max Consecutive Ones

public class Problem5 {
    public static void main(String[] args) {
        int[] nums = {0, 1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }
    public static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                count++;
                max = Math.max(max, count);
            }else count = 0;
        }
        return max;
    }
}
