package InterviewBit.Hashing.KeyFormation;

// https://www.interviewbit.com/problems/anagrams/
// Anagrams

import java.util.*;

public class Problem2 {
    public ArrayList<ArrayList<Integer>> anagrams(final List<String> A) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        Map<String, ArrayList<Integer>> map = new HashMap<>();

        for(int i = 0; i < A.size(); i++){
            char[] a = A.get(i).toCharArray();
            Arrays.sort(a);
            String s = new String(a);

            if(map.containsKey(s)){
                map.get(s).add(i+1);
            }else{
                map.put(s, new ArrayList<>());
                map.get(s).add(i+1);
            }
        }
        for(Map.Entry<String, ArrayList<Integer>> e: map.entrySet()){
            list.add(e.getValue());
        }

        return list;
    }
}
