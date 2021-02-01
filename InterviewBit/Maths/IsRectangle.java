package InterviewBit.Maths;

import java.util.*;

public class IsRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        sc.close();

        System.out.println(solve(A, B, C, D));
    }

    public static int solve(int A, int B, int C, int D) {

        if((A == B && A != C && A != D) || (A == C && A != B && A != D) || (A == D && A != B && A != C)){
            if((C == D && C != A && C != B) || (C == A && C != B && C != B) || (C == B && C != A && C != D)) return 1;
            else return 0;
        }
        else return 0;
    }
}
