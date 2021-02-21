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
/*
18 -> f1 - f2
17 -> -f2 (5)
16 -> -f1 (4)
15 -> f2 - f1 (3)
14 -> f2 (2)
13 -> f1 (1)
12 -> f1 - f2 (0)
11 -> -f2 (5)
f10 -> f9 - f8 -> -f1 (4)
f9 -> f8 - f7 -> f2 - f1
f8 -> f7 - f6 -> f1 + f2 - f1 -> f2
f7 -> f6 - f5 -> -f2 + f1 + f2 -> f1
f6 -> f5 - f4 -> -f2 + f1
f5 -> f4 - f3 -> -f1 - f2 + f1 -> -f2
f4 -> f2 - f1 - f2 -> -f1
f3 -> f2 - f1
*/