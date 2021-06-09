package InterviewBit.BinarySearch.SearchStepSimulation;

// https://www.interviewbit.com/problems/implement-power-function/
// Implement Power Function

public class Problem1 {
    public int pow(int x, int n, int d) {
        if(x == 0) return 0;
        if(n == 0) return 1%d;

        java.math.BigInteger bi = java.math.BigInteger.valueOf(x);

        return bi.modPow(java.math.BigInteger.valueOf(n), java.math.BigInteger.valueOf(d)).intValue();
    }
}
