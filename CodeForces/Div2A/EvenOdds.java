package CodeForces.Div2A;

import java.util.Scanner;

public class EvenOdds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        sc.close();

        if(k <= (n+1)/2) System.out.println(k*2-1);
        else System.out.println((k-(n+1)/2)*2);
    }
}
