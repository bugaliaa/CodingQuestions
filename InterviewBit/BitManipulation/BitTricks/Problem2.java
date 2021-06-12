package InterviewBit.BitManipulation.BitTricks;

// https://www.interviewbit.com/problems/count-total-set-bits/
// Count Total Set Bits

public class Problem2 {
    public int solve(int A) {
        if(A == 0) return 0;
        
        int x = 0;
        while((1 << x) <= A) x++;
        x--;

        return ((1 << (x-1))*x) + (A - (1 << x) + 1) + solve(A - (1 << x));
    }
}
