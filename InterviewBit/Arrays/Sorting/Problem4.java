package InterviewBit.Arrays.Sorting;

// https://www.interviewbit.com/problems/max-distance/
// Max Distance

import java.util.*;

public class Problem4 {
    public int maximumGap(final List<Integer> A) {
        int n = A.size();
        if(n == 0) return -1;
        if(n == 1) return 0;
        int max = Integer.MIN_VALUE;
        List<int[]> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            int t[] = {A.get(i), i};
            list.add(t);
        }
        Collections.sort(list, (a, b) -> a[0] - b[0]);

        int r = list.get(n-1)[1];
        for(int i = n-2; i >= 0; i--){
            max = Math.max(max, r - list.get(i)[1]);
            r = Math.max(r, list.get(i)[1]);
        }

        return max >= 0 ? max : 0;
    }
}
