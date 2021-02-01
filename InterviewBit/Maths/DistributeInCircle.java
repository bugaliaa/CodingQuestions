package InterviewBit.Maths;

import java.util.*;

public class DistributeInCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        sc.close();
        System.out.println(solve(A, B, C));
    }
    public static int solve(int A, int B, int C) {

        C = C%B-1;
        A = A%B;
        return (A+C)%B;
    }
}
