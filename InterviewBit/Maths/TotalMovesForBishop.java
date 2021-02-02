package InterviewBit.Maths;

import java.util.Scanner;

public class TotalMovesForBishop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        sc.close();
        System.out.println(solve(A, B));
    }
    public static int solve(int A, int B) {
        int l1 = Math.min(A-1, B-1);
        int l2 = Math.min(A-1, 8-B);
        int r1 = Math.min(8-A, B-1);
        int r2 = Math.min(8-A, 8-B);
        return l1+l2+r1+r2;
    }
}
