package CodeForces.Div2B;

import java.util.*;

public class Problem432B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];
        
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            max = Math.max(max, Math.max(a[i], b[i]));            
        }
        sc.close();
        int[] temp = new int[max+1];

        for(int i = 0; i < n; i++) temp[a[i]]++;

        for(int i = 0; i < n; i++){
            System.out.println(((n-1)+temp[b[i]]) + " " + ((n-1)-temp[b[i]]));
        }
    }
}