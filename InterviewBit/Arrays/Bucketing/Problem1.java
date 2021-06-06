package InterviewBit.Arrays.Bucketing;

// https://www.interviewbit.com/problems/triplets-with-sum-between-given-range/
// Triplets with sum between given range

import java.util.*;

public class Problem1 {
    public int solve(ArrayList<String> A) {
        List<Float> list = new ArrayList<>();
        for(String s: A) list.add(Float.parseFloat(s));
        int n = list.size();
        Collections.sort(list);
        for(int i = 0; i < n-2; i++){
            int j = i+1;
            int k = n-1;
            while(j < k){
                float sum = list.get(i) + list.get(j) + list.get(k);
                if(sum < 2 && sum > 1) return 1;
                else if(sum > 2) k--;
                else j++;
            }
        }
        return 0;
    }
}
