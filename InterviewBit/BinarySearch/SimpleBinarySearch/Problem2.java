package InterviewBit.BinarySearch.SimpleBinarySearch;

// https://www.interviewbit.com/problems/woodcutting-made-easy/
// Wood Cutting Made Easy

import java.util.*;

public class Problem2 {
    public int solve(ArrayList<Integer> A, int B) {
        int n = A.size();
        int min = 0;
        int ans = 0;
        int max = 0;

        for(int i = 0; i < n; i++) max = Math.max(A.get(i), max);

        while(min <= max){
            int mid = min + (max - min)/2;
            long wood = 0;
            for(int i = 0; i < n; i++){
                if(A.get(i) - mid > 0) wood += A.get(i) - mid;
            }
            if(wood >= (long)B){
                min = mid+1;
                ans = Math.max(ans, mid);
            }else{
                max = mid-1;
            }
        }

        return ans;
    }
}
