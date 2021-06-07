package InterviewBit.Maths.Adhoc;

// https://www.interviewbit.com/problems/sum-of-pairwise-hamming-distance/
// Sum of Pairwise Hamming Distance

import java.util.*;

public class Problem2 {
    public int hammingDistance(final List<Integer> A) {
        int n = A.size();
        int mod = 1000000007;
        int ans = 0;
        
        for(int i = 0; i < 32; i++){
            int count = 0;
            for(int j = 0; j < n; j++){
                if((A.get(j) & (1 << i)) == 0) count++;
            }
            ans += ((count%mod) * ((n - count)%mod) * 2)%mod;
        }
        return ans%mod;
    }
    
}
