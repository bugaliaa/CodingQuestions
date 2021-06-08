package InterviewBit.Maths.NumberTheory;

// https://www.interviewbit.com/problems/greatest-common-divisor/
// Greatest Common Divisor

public class Problem1 {
    public int gcd(int A, int B) {
        if(B == 0) return A;
        return gcd(B, A%B);
    }
}
