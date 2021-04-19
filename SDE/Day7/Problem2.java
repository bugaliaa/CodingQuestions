package SDE.Day7;

// https://leetcode.com/problems/3sum/
// 3 Sum

import java.util.*;

public class Problem2 {
    public static void main(String[] args) {
        int nums[] = {-1,0,1,2,-1,-4};
        List<List<Integer>> list = threeSum(nums);
        for(List<Integer> i: list){
            for(int j: i) System.out.print(j + " ");
            System.out.println();
        }
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        int n = nums.length;
        for(int i = 0; i < n-2; i++){
            if(i == 0 || (i > 0 && nums[i] != nums[i-1])){
                int l = i+1;
                int r = n-1;
                while(l < r){
                    int sum = nums[i] + nums[l] + nums[r];
                    if(sum == 0){
                        list.add(Arrays.asList(nums[i], nums[l], nums[r]));
                        while(l < r && nums[l] == nums[l+1]) l++;
                        while(l < r && nums[r] == nums[r-1]) r--;
                        l++;
                        r--;
                    }else if(sum < 0) l++;
                    else r--;
                }
            }
        }
        return list;
    }
}
