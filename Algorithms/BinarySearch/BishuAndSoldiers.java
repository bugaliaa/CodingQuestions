package Algorithms.BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class BishuAndSoldiers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++) a[i] = sc.nextInt();
        Arrays.sort(a);
        
        int q = sc.nextInt();
        for(int i = 0; i < q; i++){
            int p = sc.nextInt();
            int idx = Arrays.binarySearch(a, p);
            if(idx == -1){
                System.out.println(0 + " " + 0);
            }else if(idx == (-1)*(n+1)){
                int sum = 0;
                for(int j = 0; j < n; j++){
                    sum += a[j];
                }
                System.out.println(n + " " + sum);
            }else if(idx < 0){
                int k = (-1)*idx;
                int sum = 0;
                for(int j = 0; j < k; j++){
                    sum += a[j];
                }
                System.out.println(k + " " + sum);
            }else{
                int sum = 0;
                for(int j = 0; j <= idx; j++){
                    sum += a[j];
                }
                System.out.println(idx+1 + " " + sum);
            }
        }
        sc.close();
    }
}