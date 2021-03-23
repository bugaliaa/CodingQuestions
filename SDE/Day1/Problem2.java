package SDE.Day1;

import java.util.Scanner;

// https://www.geeksforgeeks.org/find-a-repeating-and-a-missing-number/
// Find missing and repeated number

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++) a[i] = sc.nextInt();
        sc.close();
        int res[] = solve(a);
        System.out.println("Missing Number: " + res[0] + " Repeating Number: " + res[1]);
    }
    public static int[] solve(int[] a){
        int res[] = new int[2];
        int xor1 = a[0];

        for(int i = 1; i < a.length; i++){
            xor1 ^= a[i];
        }
        for(int i = 1; i <= a.length; i++){
            xor1 ^= i;
        }
        int setBit = xor1 & ~(xor1-1);
        for(int i = 0; i < a.length; i++){
            if((a[i] & setBit) != 0) res[0] ^= a[i];
            else res[1] ^= a[i];
        }
        for(int i = 1; i <= a.length; i++){
            if((i&setBit) != 0) res[0] ^= i;
            else res[1] ^= i;
        }
        return res;
    }
}
