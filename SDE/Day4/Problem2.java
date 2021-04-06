package SDE.Day4;

import java.util.*;

public class Problem2 {
    public static void main(String[] args) {
        
    }
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        if(nums ==  null || nums.length == 0) return res;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                int t = target-nums[i]-nums[j];
                int l = j+1;
                int r = nums.length-1;
                while(l < r){
                    int twoSum = nums[l]+nums[r];
                    if(twoSum == t){
                        List<Integer> quad = new ArrayList<>();
                        quad.add(nums[i]);
                        quad.add(nums[j]);
                        quad.add(nums[l]);
                        quad.add(nums[r]);
                        res.add(quad);

                        while(l < r && nums[l] == quad.get(2)) l++;

                        while(l < r && nums[r] == quad.get(3)) r--;
                    }else if(twoSum < t) l++;
                    else r--;
                }
                while(j + 1 < nums.length && nums[j+1] == nums[j]) j++;
            }
            while(i+1 < nums.length && nums[i+1] == nums[i]) i++;
        }
        return res;
    }
}
