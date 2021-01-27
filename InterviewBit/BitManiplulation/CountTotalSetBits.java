package InterviewBit.BitManiplulation;

import java.util.Scanner;

public class CountTotalSetBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        sc.close();
        System.out.println(solve(A));
    }
    public static int solve(int A) {
        if(A == 0) return 0;
        int x = 0;
        while((1 << x) <= A) x++;
        x--;

        return x*(1 << (x-1)) + (A - (1 << x) + 1) + solve(A - (1 << x));
    }
    
}
