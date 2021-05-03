package SDE.Day9;

// https://practice.geeksforgeeks.org/problems/subset-sums2234/1#
// Subset Sums (GFG)

import java.util.*;

public class Problem1 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(2, 3));
        ArrayList<Integer> res = subsetSums(arr, arr.size());
        for(int i: res) System.out.println(i + " ");
    }
    public static ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){
        ArrayList<Integer> res = new ArrayList<>();
        helper(arr, N, 0, res, 0);
        Collections.sort(res);
        return res;
    }
    public static void helper(ArrayList<Integer> arr, int N, int i, ArrayList<Integer> res, int sum){
        if(i == N){
            res.add(sum);
            return;
        }

        helper(arr, N, i+1, res, sum + arr.get(i));
        helper(arr, N, i+1, res, sum);
    }
}
