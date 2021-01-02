package Arrays;

import java.util.*;
import java.util.Map.Entry;

/* Given a non-empty array of integers nums, every element appears twice except for one. Find that single one. */

public class SingleNumber {
    public int singleNumber(int[] nums) {
         Map<Integer, Integer> map = new HashMap<>();
         
         for(int i = 0; i < nums.length; i++){
             if(map.containsKey(nums[i])){
                 map.put(nums[i], 2);
             }else{
                 map.put(nums[i], 1);
             }
         }

         for(Entry<Integer, Integer> e: map.entrySet()){
             if(e.getValue() == 1) return e.getKey();
         }
         return 0;
    }
}
