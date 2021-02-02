package InterviewBit.Maths;

import java.util.Scanner;

public class TrailingZeroesInFact {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        sc.close();
        System.out.println(trailingZeroes(A));
    }

    public static int trailingZeroes(int A) {
        int res = 0;
        for(int i = 5; i <= A; i *= 5){
            res += A/i;
        }
        return res;
    }
}
