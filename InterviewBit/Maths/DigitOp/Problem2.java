package InterviewBit.Maths.DigitOp;

// https://www.interviewbit.com/problems/reverse-integer/
// Reverse Integer

public class Problem2 {
    public int reverse(int A) {
        boolean flag = false;
        if(A < 0){
            flag = true;
            A = A*(-1);
        }
        long ans = 0;
        while(A > 0){
            int digit = A%10;
            ans = ans*10 + digit;
            A /= 10;
            if(ans < Integer.MIN_VALUE || ans > Integer.MAX_VALUE) return 0;
        }
        return flag ? (int)ans*(-1) : (int)ans;
    }
}
