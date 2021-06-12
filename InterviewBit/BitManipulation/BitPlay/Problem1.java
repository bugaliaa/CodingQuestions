package InterviewBit.BitManipulation.BitPlay;

// https://www.interviewbit.com/problems/number-of-1-bits/
// Number of 1 Bits

public class Problem1 {
    public int numSetBits(long a) {
        int ans = 0;
        while(a != 0){
            a &= a-1;
            ans++;
        }
        return ans;
    }
}
