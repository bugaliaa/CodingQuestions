package SDE.Day7;

// https://leetcode.com/problems/trapping-rain-water/
// Trapping Rain Water

public class Problem3 {
    public static void main(String[] args) {
        int[] height = {};
        System.out.println(trap(height));
    }
    public static int trap(int[] height) {
        int res = 0;
        int left_max = 0;
        int right_max = 0;
        int l = 0;
        int r = height.length-1;

        while(l < r){
            if(height[l] <= height[r]){
                if(height[l] >= left_max) left_max = height[l];
                else{
                    res += left_max - height[l];
                }
                l++;
            }else{
                if(height[r] >= right_max) right_max = height[r];
                else{
                    res += right_max - height[r];
                }
                r--;
            }
        }
        return res;
    }
}
