package CodeForces.Div2A;

import java.util.Arrays;
import java.util.Scanner;

public class Twins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        int totalSum = 0;
        int sum = 0;
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
            totalSum += a[i];
        }
        sc.close();
        Arrays.sort(a);

        int coins = 0;
        for(int i = a.length-1; i >= 0; i--){
            sum += a[i];
            totalSum = totalSum - a[i];
            coins++;
            if(sum > totalSum) break;
        }
        System.out.println(coins);
    }
}
