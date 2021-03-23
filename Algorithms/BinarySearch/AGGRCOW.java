package Algorithms.BinarySearch;

// https://www.spoj.com/problems/AGGRCOW/

import java.util.Arrays;
import java.util.Scanner;

public class AGGRCOW {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int c = sc.nextInt();
            long[] a = new long[n];
            for(int i = 0; i < n; i++) a[i] = sc.nextLong();
            Arrays.sort(a);
            long res = -1;
            long left = a[0];
            long right = a[n-1] - a[0];

            while(left < right){
                long mid = (left+right)/2;
                if(check(mid, a, n, c)){
                    res = Math.max(res, mid);
                    left = mid+1;
                }else{
                    right = mid;
                }
            }
            System.out.println(res);
        }
        sc.close();
    }

    public static boolean check(long mid, long[] a, int n, int c){
        long pos = a[0];
        int elements = 1;

        for(int i = 1; i < n; i++){
            if(a[i] - pos >= mid){
                elements++;
                pos = a[i];
                if(elements == c) return true;
            }
        }
        return false;
    }
}
