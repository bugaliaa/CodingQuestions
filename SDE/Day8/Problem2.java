package SDE.Day8;

// https://practice.geeksforgeeks.org/problems/minimum-platforms-1587115620
// Minimum Platforms

import java.util.*;

public class Problem2 {
    public static void main(String[] args) {
        int arr[] = {900, 940, 950, 1100, 1500, 1800};
        int dep[] = {910, 1200, 1120, 1130, 1900, 2000};
        System.out.println(findPlatform(arr, dep, arr.length));
    }
    public static int findPlatform(int arr[], int dep[], int n){
        Arrays.sort(arr);
        Arrays.sort(dep);

        int platforms = 1;
        int max = 1;
        int i = 1;
        int j = 0;
        while(i < n && j < n){
            if(arr[i] <= dep[j]){
                platforms++;
                i++;
            }else if(arr[i] > dep[j]){
                platforms--;
                j++;
            }
            if(platforms > max) max = platforms;
        }
        return max;
    }
}
