package CodeForces.Div2A;

import java.util.Scanner;

public class MinimumDifficulty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        a[0] = sc.nextInt();
        int d[] = new int[n];
        int s = 0;
        int m = Integer.MAX_VALUE;
        for(int i = 1; i < n; i++){
            a[i] = sc.nextInt();
            d[i] = a[i] - a[i-1];
            s = Math.max(s, d[i]);
        }
        sc.close();
        for(int i = 2; i < n; i++){
            m = Math.max(Math.min(m, d[i] + d[i-1]), s);
        }
        System.out.println(m);
    }
}
