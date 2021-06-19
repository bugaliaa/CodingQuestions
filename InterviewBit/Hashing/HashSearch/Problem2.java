package InterviewBit.Hashing.HashSearch;

// https://www.interviewbit.com/problems/largest-continuous-sequence-zero-sum/
// Largest Continuous Sequence Zero Sum

import java.util.*;

public class Problem2 {
    public ArrayList<Integer> lszero(ArrayList<Integer> A) {
        Map<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        
        int sum = 0;
        int len = 0;

        int st = -1;
        int end = -1;

        for(int i = 0; i < A.size(); i++){
            sum += A.get(i);

            if(A.get(i) == 0 && len == 0) len = 1;

            if(sum == 0) len = i+1;

            if(map.containsKey(sum)){
                if(len < i - map.get(sum)){
                    st = map.get(sum) + 1;
                    end = i;
                    len = i - map.get(sum);
                }
            }else map.put(sum, i);
        }
        if(st >= 0 && end >= 0){
            for(int i = st; i <= end; i++) list.add(A.get(i));
        }

        return list;
    }
}
