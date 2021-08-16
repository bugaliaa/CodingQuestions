package InterviewBit.Maths;

import java.util.Scanner;

public class GreatestCommonDIvisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        sc.close();
        System.out.println(gcd(A, B));
    }
    public static int gcd(int A, int B) {
        if(B == 0) return A;
        return gcd(B, A%B);
    }
    //
}
