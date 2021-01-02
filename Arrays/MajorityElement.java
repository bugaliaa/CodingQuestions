package Arrays;

/*
Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

*/

public class MajorityElement {
    public int majorityElement(int[] nums) {
        int count = 0;
        int ele = 0;
        
        for(int i: nums){
            if(count == 0) ele = i;
            if(i == ele) count++;
            else count--;
        }
        return ele;
    }
}