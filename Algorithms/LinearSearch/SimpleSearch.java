package Algorithms.LinearSearch;

import java.util.Scanner;

// https://www.hackerearth.com/practice/algorithms/searching/linear-search/practice-problems/algorithm/simple-search-4/

public class SimpleSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++)a[i] = sc.nextInt();
        int x = sc.nextInt();
        sc.close();
        System.out.println(helper(a, x));
    }
    public static int helper(int[] a, int x){
        for(int i = 0; i < a.length; i++) if(a[i] == x) return i;
        return -1;
    }
}
