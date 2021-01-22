package CodeForces.Div2A;

import java.util.*;

public class FoxAndNumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int g = sc.nextInt();
        int x = 0;

        for(int i = 1; i < n; i++){
            x = sc.nextInt();
            g = gcd(g, x);
        }
        sc.close();
        
        System.out.println(g*n);
    }

    private static int gcd(int a, int b) {
        if(a == 0) return b;
        return gcd(b%a, a);
    }
}
