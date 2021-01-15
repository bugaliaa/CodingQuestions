package CodeForces.Div2A;

import java.util.Scanner;

public class PerfectPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        if(n%2 == 1) System.out.println(-1);
        else{
            int[] a = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = i+1;
            }
            for(int i = 0; i < n-1; i += 2){
                int temp = a[i];
                a[i] = a[i+1];
                a[i+1] = temp;
            }
            for(int i: a) System.out.print(i + " ");
        }
    }
}
