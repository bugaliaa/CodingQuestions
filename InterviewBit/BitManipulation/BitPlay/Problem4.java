package InterviewBit.BitManipulation.BitPlay;

import java.util.ArrayList;

// https://www.interviewbit.com/problems/different-bits-sum-pairwise/
// Different Bits Sum Pairwise

public class Problem4 {
    public int cntBits(ArrayList<Integer> A) {
        int ans = 0;
        int mod = 1000000007;
        for(int i = 0; i < 32; i++){
            int c = 0;
            for(int j = 0; j < A.size(); j++){
                if((A.get(j) & (1 << i)) == 0) c++;
            }

            ans = ans%mod + (c*(A.size() - c)*2);
        }

        return ans%mod;
    }
}
