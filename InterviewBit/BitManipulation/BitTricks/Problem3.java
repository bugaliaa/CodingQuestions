package InterviewBit.BitManipulation.BitTricks;

// https://www.interviewbit.com/problems/palindromic-binary-representation/
// Palindromic Binary Representation

public class Problem3 {
    public int solve(int A) {
        int count = 1;
        int len = 1;

        while(count < A){
            len++;
            count += (1 << (len-1)/2);    
        }

        count -= (1 << (len-1)/2);
        int offset = A - count - 1;

        int ans = (1 << (len-1));
        ans |= (offset << (len/2));

        int valRev = (ans >> (len/2));
        int rev = getRev(valRev);

        ans |= rev;

        return ans;
    }
    public int getRev(int n){
        int rev = 0;

        while(n != 0){
            int lowestBit = n & 1;
            rev |= lowestBit;

            rev <<= 1;
            n >>= 1;
        }

        rev >>= 1;

        return rev;
    }
}
