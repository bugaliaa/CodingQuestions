package InterviewBit.Arrays.SimulationArray;

// https://www.interviewbit.com/problems/perfect-peak-of-array/
// Perfect peak of array

import java.util.*;

public class Problem1 {
    public int perfectPeak(ArrayList<Integer> A) {
        int n = A.size();
        int[] maxLeft = new int[n];
        maxLeft[0] = A.get(0);
        for(int i = 1; i < n; i++){
            maxLeft[i] = Math.max(maxLeft[i-1], A.get(i));
        }

        int[] minRight = new int[n];
        minRight[n-1] = A.get(n-1);
        for(int i = n-2; i >= 0; i--){
            minRight[i] = Math.min(minRight[i+1], A.get(i));
        }

        for(int i = 1; i < n-1; i++){
            if(A.get(i) > maxLeft[i-1] && A.get(i) < minRight[i+1]) return 1;
        }

        return 0;
    }
}
