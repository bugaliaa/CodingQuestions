package CodeForces.Div2A;

import java.util.Scanner;

public class BearAndRaspberry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();

        int a[] = new int[n];
        for(int i = 0; i < n; i++) a[i] = sc.nextInt();
        sc.close();
        
        int t = 0;
        for(int i = 0; i < n-1; i++) t = Math.max(t, a[i] - a[i+1] - c);

        System.out.println(t);
        
    }
}
