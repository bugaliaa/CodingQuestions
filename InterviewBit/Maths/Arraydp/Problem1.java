package InterviewBit.Maths.Arraydp;

// https://www.interviewbit.com/problems/numbers-of-length-n-and-value-less-than-k/
// Numbers of Length N and Value less than K

import java.util.*;

public class Problem1 {
    public int solve(ArrayList<Integer> A, int B, int C) {
        List<Integer> digit = numToList(C);
        int d = A.size();

        if(B > digit.size() || d == 0) return 0;
        else if(B < digit.size()){
            if(A.get(0) == 0 && B != 1) return (int) ((d-1)*Math.pow(d, B-1));
            else return (int) Math.pow(d, B);
        }else{
            int dp[] = new int[B+1];
            int lower[] = new int[11];

            for(int i = 0; i < d; i++){
                lower[A.get(i) + 1] = 1;
            }
            for(int i = 1; i < 11; i++){
                lower[i] = lower[i-1] + lower[i];
            }

            dp[0] = 0;
            boolean flag = true;

            for(int i = 1; i <= B; i++){
                int d2 = lower[digit.get(i-1)];
                dp[i] = dp[i-1]*d;

                if(i == 1 && A.get(0) == 0 && B != 1) d2 = d2-1;

                if(flag) dp[i] += d2;
                
                flag = flag && (lower[digit.get(i-1) + 1] == (lower[digit.get(i-1)]+1));
            }

            return dp[B];
        }
    }
    public List<Integer> numToList(int n){
        List<Integer> list = new ArrayList<>();
        while(n != 0){
            int digit = n%10;
            list.add(digit);
            n /= 10;
        }
        if(list.size() == 0) list.add(0);

        Collections.reverse(list);

        return list;
    }
}
