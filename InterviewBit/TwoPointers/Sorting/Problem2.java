package InterviewBit.TwoPointers.Sorting;

// https://www.interviewbit.com/problems/3-sum/
// 3 Sum

import java.util.*;

public class Problem2 {
    public int threeSumClosest(ArrayList<Integer> A, int B) {
        Collections.sort(A);
        int ans = 0;
        int diff = Integer.MAX_VALUE;

        for(int i = 0; i < A.size()-2; i++){
            int j = i+1;
            int k = A.size()-1;
            while(j < k){
                int sum = A.get(i) + A.get(j) + A.get(k);
                if(B == sum) return sum;
                if(diff >= Math.abs(B-sum)){
                    diff = Math.abs(B-sum);
                    ans = sum;
                }
                if(sum < B) j++;
                else k--;
            }
        }

        return ans;
    }
}
