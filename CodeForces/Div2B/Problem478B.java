package CodeForces.Div2B;

import java.util.Scanner;

public class Problem478B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long m = sc.nextInt();
        sc.close();
        
        long kmax = ((n-(m-1))*(n-(m-1)-1)/2);
        
        long size = n/m;
        long rem = n%m;
        long kmin = rem*(size+1)*(size)/2 + (m - rem)*(size)*(size-1)/2;
        System.out.println(kmin + " " + kmax);
    }
}
