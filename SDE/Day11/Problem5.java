package SDE.Day11;

// https://leetcode.com/problems/median-of-two-sorted-arrays/
// Median of two sorted arrays (LeetCode)

public class Problem5 {
    public static void main(String[] args) {
        int nums1[] = {1,3};
        int nums2[] = {3,7};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int[] a = new int[n+m];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i < n && j < m){
            if(nums1[i] <= nums2[j]){
                a[k] = nums1[i];
                i++;
            }else{
                a[k] = nums2[j];
                j++;
            }
            k++;
        }
        while(i < n){
            a[k] = nums1[i];
            k++;
            i++;
        }
        while(j < m){
            a[k] = nums2[j];
            k++;
            j++;
        }
        double ans = 0;
        if(a.length%2 == 0){
            int mid = a.length/2;
            ans = (double)((double)a[mid] + (double)a[mid-1])/2;
        }else{
            ans = a[a.length/2];
        }
        return ans;
    }
}
