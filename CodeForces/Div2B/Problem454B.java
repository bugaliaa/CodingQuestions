package CodeForces.Div2B;

import java.util.Scanner;

public class Problem454B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++) a[i] = sc.nextInt();
        sc.close();

        int idx = 0;
        while(idx < n-1 && a[idx] <= a[idx+1]) idx++;
        
        if(idx == n-1) System.out.println(0);
        else{            
            boolean flag = true;
            for(int i = idx+1; i < n-1; i++){
                if(a[i] > a[i+1]){
                    flag = false;
                    break;
                }
            }
            if(!flag || a[n-1] > a[0]) System.out.println(-1);
            else System.out.println((n-1) - idx);
        }
    }
}