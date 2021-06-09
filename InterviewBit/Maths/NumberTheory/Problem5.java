package InterviewBit.Maths.NumberTheory;

// https://www.interviewbit.com/problems/largest-coprime-divisor/
// Largest Coprime Divisor

public class Problem5 {
    public int cpFact(int A, int B) {
        while(gcd(A, B) != 1){
            A = A/gcd(A, B);
        }
        return A;
    }
    public int gcd(int a, int b){
        if(b == 0) return a;
        return gcd(b, a%b);
    }
}
