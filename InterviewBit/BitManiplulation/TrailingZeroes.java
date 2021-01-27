package InterviewBit.BitManiplulation;

import java.util.Scanner;

public class TrailingZeroes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        sc.close();
        System.out.println(solve(A));
    }
    public static int solve(int A) {
        int ans = 0;
        while((A&1) == 0){
            ans++;
            A = A >> 1;
        }
        return ans;
    }
}
