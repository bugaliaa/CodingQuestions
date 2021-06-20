package InterviewBit.Hashing.IncrementalHash;

// https://www.interviewbit.com/problems/substring-concatenation/
// Substring Concatenation

import java.util.*;

public class Problem4 {
    public ArrayList<Integer> findSubstring(String A, final List<String> B) {
        Map<String, Integer> map = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();

        int sizeWord = B.get(0).length();
        int words = B.size();
        int totalChar = sizeWord*words;
        int n = A.length();

        if(totalChar > n) return ans;

        for(String w: B){
            map.put(w, map.getOrDefault(w, 0)+1);
        }

        for(int i = 0; i <= n - totalChar; i++){
            HashMap<String, Integer> temp = new HashMap<>(map);
            int j = i;
            int count = words;
            while(j < i+totalChar){
                String word = A.substring(j, j+sizeWord);
                if(!map.containsKey(word) || temp.get(word) == 0){
                    break;
                }else{
                    temp.put(word, temp.get(word)-1);
                    count--;
                }
                j += sizeWord;
            }

            if(count == 0) ans.add(i);
        }

        return ans;
    }
}
