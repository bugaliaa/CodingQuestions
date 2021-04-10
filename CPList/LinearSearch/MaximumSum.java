package CPList.LinearSearch;

import java.util.Scanner;

//https://www.hackerearth.com/practice/algorithms/searching/linear-search/practice-problems/algorithm/maximum-sum-4-f8d12458/

public class MaximumSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++) a[i] = sc.nextInt();
        sc.close();
        long sum = 0;
        long c = 0;
        for(int i = 0; i < n; i++){
            if(a[i] >= 0){
                sum += a[i];
                c++;
            }
        }
        if(sum == 0){
            sum = a[0];
            for(int i = 1; i < n; i++) sum = Math.max(sum, a[i]);
            c = 1;
        }
        System.out.println(sum + " " + c);
    }
}
