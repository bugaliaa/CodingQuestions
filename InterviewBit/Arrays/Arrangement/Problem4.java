package InterviewBit.Arrays.Arrangement;

// https://www.interviewbit.com/problems/find-permutation/
// Find Permutation

import java.util.*;

public class Problem4 {
    public ArrayList<Integer> findPerm(final String A, int B) {
        ArrayList<Integer> ans = new ArrayList<>();

        int max = B;
        int min = 1;
        for(int i = B-1; i>= 0; i--){
            if(A.charAt(i) == 'I'){
                ans.add(max);
                max--;
            }else{
                ans.add(min);
                min++;
            }
        }
        ans.add(max);
        Collections.reverse(ans);
        return ans;
    }
}
