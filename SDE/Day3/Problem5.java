package SDE.Day3;

import java.util.*;

//https://leetcode.com/problems/majority-element-ii/
//Majority Elemnt II

public class Problem5 {
    public static void main(String[] args) {
        int[] nums = {3,2,3};
        List<Integer> ans = majorityElement(nums);
        for(int i: ans) System.out.print(i + " ");
    }
    public static List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();
        if(nums == null || nums.length == 0) return list;

        int c1 = 0, c2 = 0;
        int n1 = -1, n2 = -1;

        for(int i: nums){
            if(i == n1) c1++;
            else if(i == n2) c2++;
            else if(c1 == 0){
                n1 = i;
                c1 = 1;
            }
            else if(c2 == 0){
                n2 = i;
                c2 = 1;
            }
            else{
                c1--;
                c2--;
            }
        }
        c1 = 0;
        c2 = 0;

        for(int i: nums){
            if(i == n1) c1++;
            else if(i == n2) c2++;
        }
        
        if(c1 > nums.length/3) list.add(n1);
        if(c2 > nums.length/3) list.add(n2);

        return list;
    }
}
