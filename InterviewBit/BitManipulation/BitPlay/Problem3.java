package InterviewBit.BitManipulation.BitPlay;

// https://www.interviewbit.com/problems/divide-integers/
// Divide Integers

public class Problem3 {
    public int divide(int A, int B) {

        if(B == 0) return Integer.MAX_VALUE;
        if(B == 1) return A;
        if(B == -1) return (A == Integer.MIN_VALUE) ? Integer.MAX_VALUE : -A;
        if(A == B) return 1;
        if(B == Integer.MIN_VALUE) return 0;

        int sign = ((A < 0)^(B < 0)) ? -1 : 1;

        A = Math.abs(A);
        B = Math.abs(B);

        long q = 0;

        while(A-B >= 0){
            int x = 0;
            while((A-(B<<1<<x)) >= 0){
                x++;
            }
            q += 1 << x;
            A -= B << x;
        }

        return sign*(int)q;
    }
}
