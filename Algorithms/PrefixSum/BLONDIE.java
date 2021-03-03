package Algorithms.PrefixSum;

// https://www.codechef.com/problems/BLONDIE

import java.util.Scanner;

public class BLONDIE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            long sum = 0;
            for(int i = 0; i < n; i++){
                int x = sc.nextInt();
                if(x < 0) x = (int)(sum / i);
                sum += x;
                System.out.print(x + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
