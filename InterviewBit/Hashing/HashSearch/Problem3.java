package InterviewBit.Hashing.HashSearch;

// https://www.interviewbit.com/old/problems/2-sum/
// 2 Sum

import java.util.*;

public class Problem3 {
    public ArrayList<Integer> twoSum(final List<Integer> A, int B) {
        Map<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();
        
        for(int i = 0; i < A.size(); i++){
            if(map.containsKey(B-A.get(i))){
                ans.add(map.get(B-A.get(i)));
                ans.add(i+1);                
                return ans;
            }
            map.putIfAbsent(A.get(i), i+1);
        }

        return ans;
    }
}
