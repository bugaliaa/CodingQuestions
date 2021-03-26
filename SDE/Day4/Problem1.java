package SDE.Day4;

import java.util.*;

public class Problem1 {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int[] ans = twoSum(nums, 9);
        for(int i: ans) System.out.print(i + " ");
    }
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] res = {0,0};
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(target-nums[i])){
                res[0] = i;
                res[1] = map.get(target-nums[i]);
                return res;
            }
            map.put(nums[i], i);
        }
        return res;
    }
}
