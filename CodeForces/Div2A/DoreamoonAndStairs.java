package CodeForces.Div2A;

import java.util.Scanner;

public class DoreamoonAndStairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.close();
        if(n < m) System.out.println(-1);
        else{
            System.out.println((n + (2 * m) - 1) / 2 / m * m);
        }
    }
}