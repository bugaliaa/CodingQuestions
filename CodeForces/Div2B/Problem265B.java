package CodeForces.Div2B;

import java.util.Scanner;

public class Problem265B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++) a[i] = sc.nextInt();
        sc.close();

        int time = a[0]+1;
        
        for(int i = 0; i < n-1; i++){
            time += Math.abs(a[i] - a[i+1]) + 2;    
        }

        System.out.println(time);
    }
}
