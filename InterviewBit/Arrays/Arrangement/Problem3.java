package InterviewBit.Arrays.Arrangement;

// https://www.interviewbit.com/problems/next-permutation/
// Next Permutation

import java.util.*;

public class Problem3 {
    public ArrayList<Integer> nextPermutation(ArrayList<Integer> A) {
        if(A == null || A.size() == 0) return A;
        int n = A.size();
        int i = n-2;
        while(i >= 0 && A.get(i) >= A.get(i+1)) i--;
        if(i >= 0){
            int j = n-1;
            while(A.get(j) <= A.get(i)) j--;
            Collections.swap(A, i, j);
        }
        reverse(A, i+1, n-1);
        return A;
    }
    public void reverse(ArrayList<Integer> A, int i, int j){
        while(i <= j){
            int temp = A.get(i);
            A.set(i, A.get(j));
            A.set(j, temp);
            i++;
            j--;
        }
    }
}
