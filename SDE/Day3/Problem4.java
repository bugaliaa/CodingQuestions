package SDE.Day3;

//Majority Element (Moore's Voting Algorithm)
//https://leetcode.com/problems/majority-element

public class Problem4 {
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }
    public static int majorityElement(int[] nums) {
        int count = 0;
        int ele = 0;
        for(int i = 0; i < nums.length; i++){
            if(count == 0){
                ele = nums[i];
            }
            if(ele == nums[i]){
                count++;
            }else count--;
        }
        return ele;
    }
}
