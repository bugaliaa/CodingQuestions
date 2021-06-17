package InterviewBit.StackAndQueues.StackMath;

import java.util.*;

// https://www.interviewbit.com/problems/rain-water-trapped/
// Rain Water Trapped

public class Problem2 {
    public int trap(final List<Integer> A) {
        int ans = 0;
        int leftMax = 0;
        int rightMax = 0;
        int l = 0;
        int r = A.size()-1;

        while(l < r){
            if(A.get(l) <= A.get(r)){
                if(A.get(l) >= leftMax) leftMax = A.get(l);
                else{
                    ans += leftMax - A.get(l);
                }
                l++;
            }else{
                if(A.get(r) >= rightMax) rightMax = A.get(r);
                else{
                    ans += rightMax - A.get(r);
                }
                r--;
            }
        }

        return ans;
    }
}
