package InterviewBit.HeapsAndMaps.Map;

// https://www.interviewbit.com/problems/distinct-numbers-in-window/
// Distinct Numbers in Window

import java.util.*;

public class Problem1 {
    public ArrayList<Integer> dNums(ArrayList<Integer> A, int B) {
        ArrayList<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        int t = 0;
        for(int i = 0; i < A.size(); i++){
            if(i >= B){
                map.put(A.get(i-B), map.getOrDefault(A.get(i-B), 0)-1);
                if(map.get(A.get(i-B)) == 0) t--;
            }
            map.put(A.get(i), map.getOrDefault(A.get(i), 0)+1);
            if(map.get(A.get(i)) == 1) t++;
            if(i >= B-1) list.add(t);
        }

        return list;
    }
}
