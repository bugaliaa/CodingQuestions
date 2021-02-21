package CodeForces.Div2B;

import java.util.Scanner;

public class Problem450B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int n = sc.nextInt();
        sc.close();
        long[] ar = {x, y, y-x, -x, -y, x-y};
        int MOD = 1000000007;
        System.out.println((ar[(n-1)%6]%MOD + MOD)%MOD);
    }
}