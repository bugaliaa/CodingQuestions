package Algorithms.PrefixSum;

import java.util.Scanner;

// https://www.hackerrank.com/contests/ab-yeh-kar-ke-dikhao/challenges/kj-and-street-lights/problem

public class KJandStreetLights {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        int pre[] = new int[p+2];
        for(int i = 0; i < n; i++){
            int x = sc.nextInt();
            int r = sc.nextInt();
            int R = x+r;
            int L = x-r;
            if(L < 0) L = 0;
            if(R > p) R = p;
            pre[L] += 1;
            pre[R+1] -= 1;
        }
        sc.close();
        for(int i = 1; i < p+2; i++) pre[i] += pre[i-1];
        int c = 0;
        for(int i = 0; i < p+1;){
            if(pre[i] != 1){
                int a = 1;
                int j = i+1;
                while(j < p+1 && pre[j] != 1){
                    a++;
                    j++;
                }
                i = j+1;
                c = Math.max(c, a);
            }else{
                i++;
            }
        }
        System.out.println(c);
    }
}
