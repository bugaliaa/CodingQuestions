package InterviewBit.Maths.DigitOp;

// https://www.interviewbit.com/problems/palindrome-integer/
// Palindrome Integer

public class Problem1 {
    public int isPalindrome(int A) {
        if(A < 0) return 0;
        if(A == rev(A)) return 1;
        return 0;
    }
    public int rev(int A){
        int ans = 0;
        while(A > 0){
            int digit = A%10;
            ans += digit + (ans*10);
            A = A/10;
        }
        return ans;
    }
}
