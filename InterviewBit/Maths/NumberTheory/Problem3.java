package InterviewBit.Maths.NumberTheory;

// https://www.interviewbit.com/problems/trailing-zeros-in-factorial/
// Trailing Zeroes in Factorial

public class Problem3 {
    public int trailingZeroes(int A) {
        int ans = 0;
        for(int i = 5; i <= A; i *= 5){
            ans += A/i;
        }
        return ans;
    }
}
