package Algorithms.PrefixSum;

// https://www.spoj.com/problems/CSUMQ/

import java.util.Scanner;

public class CSUMQ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++)a[i] = sc.nextInt();
        int[] psa = new int[n];
        psa[0] = a[0];
        for(int i = 1; i < n; i++){
            psa[i] += a[i] + psa[i-1];
        }
        int q = sc.nextInt();
        while(q-- > 0){
            int i = sc.nextInt();
            int j = sc.nextInt();
            if(i == 0){
                System.out.println(psa[j]);
            }else{
                System.out.println(psa[j] - psa[i-1]);
            }
        }
        sc.close();
    }
}
