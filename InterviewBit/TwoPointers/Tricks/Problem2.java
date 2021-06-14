package InterviewBit.TwoPointers.Tricks;

// https://www.interviewbit.com/problems/max-continuous-series-of-1s/
// Max Continuous Series of 1s

import java.util.*;

public class Problem2 {
    public ArrayList<Integer> maxone(ArrayList<Integer> A, int B) {
        ArrayList<Integer> list = new ArrayList<>();

        int c = 0;
        int l = 0;
        int max = 0;

        int L = -1;
        int R = -1;

        for(int i = 0; i < A.size(); i++){
            if(A.get(i) == 0) c++;

            while(c > B){
                if(A.get(l) == 0) c--;
                l++;
            }

            if(i - l + 1 > max){
                max = i - l + 1;
                L = l;
                R = i;
            }
        }

        for(int i = L; i <= R; i++){
            list.add(i);
        }

        return list;
    }
}
