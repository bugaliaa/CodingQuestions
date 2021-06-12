package InterviewBit.BitManipulation.BitPlay;

// https://www.interviewbit.com/problems/reverse-bits/
// Reverse Bits

public class Problem2 {
    public long reverse(long a) {
        long rev = 0;
        for(int i = 0; i < 32; i++){
            rev <<= 1L;
            if((int)(a&1) == 1) rev ^= 1;
            a >>= 1L;
        }
        return rev;
    }
}
