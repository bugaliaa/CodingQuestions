package InterviewBit.Arrays.ArrayMath;

// https://www.interviewbit.com/problems/add-one-to-number/
// Add one to number

import java.util.*;

public class Problem5 {
    public ArrayList<Integer> plusOne(ArrayList<Integer> A) {
        ArrayList<Integer> ans = new ArrayList<>();
        int n = A.size();
        int carry = 0;
        int j = 0;
        while(j < n && A.get(j) == 0) j++;
        if(j == n){
            ans.add(1);
            return ans;
        }
        for(int i = n-1; i >= j; i--){
            int sum = i == n-1 ? A.get(i)+1 : A.get(i)+carry;
            if(sum < 10){
                carry = 0;
                ans.add(sum);
            }else{
                ans.add(0);
                carry = 1;
            }
        }
        if(carry == 1) ans.add(1);
        Collections.reverse(ans);
        return ans;
    }
}
