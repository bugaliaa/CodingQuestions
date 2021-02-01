package InterviewBit.Maths;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.nextInt());
        sc.close();
    }
    public static int reverse(int A) {
        boolean isNeg = false;
        if(A < 0){
            isNeg = true;
            A = A*(-1);
        }

        long ans = 0;
        while(A != 0){
            int digit = A%10;
            ans = ans*10 + digit;
            A /= 10;
            if(ans < Integer.MIN_VALUE || ans > Integer.MAX_VALUE) return 0;
        }
        if(isNeg) return (int)ans*(-1);
        return (int)ans;
    }
}
