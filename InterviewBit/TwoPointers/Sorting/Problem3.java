package InterviewBit.TwoPointers.Sorting;

// https://www.interviewbit.com/problems/3-sum-zero/
// 3 Sum Zero

import java.util.*;

public class Problem3 {
    public ArrayList<ArrayList<Integer>> threeSum(ArrayList<Integer> A) {
        Collections.sort(A);
        int n = A.size();
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        
        for(int i = 0; i < A.size()-2; i++){
            if(i == 0 || (i > 0 && A.get(i) != A.get(i-1))){
                int l = i+1;
                int r = n-1;
                while(l < r){
                    long sum = (long)A.get(i) + (long)A.get(l) + (long)A.get(r);
                    if(sum == 0){
                        ArrayList<Integer> temp = new ArrayList<>();
                        temp.add(A.get(i));
                        temp.add(A.get(l));
                        temp.add(A.get(r));
                        list.add(temp);
                        while(l < r && A.get(l) == A.get(l+1)) l++;
                        while(l < r && A.get(r) == A.get(r-1)) r--;
                        l++;
                        r--;
                    }else if(sum < 0) l++;
                    else r--;
                }
            }
        }

        return list;
    }
}
