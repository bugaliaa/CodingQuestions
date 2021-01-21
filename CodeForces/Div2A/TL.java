package CodeForces.Div2A;

import java.util.Arrays;
import java.util.Scanner;

public class TL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a[] = new int[n];
        
        for(int i = 0; i < n; i++) a[i] = sc.nextInt();
        Arrays.sort(a);
        
        int b[] = new int[m];
        
        for(int i = 0; i < m; i++) b[i] = sc.nextInt();
        Arrays.sort(b);
        
        sc.close();
        
        int v = a[0];
        int p = a[n-1];
        int c = b[0];

        if(Math.max(2*v, p) < c) System.out.println(Math.max(2*v, p));
        else System.out.println(-1);
    }
}
