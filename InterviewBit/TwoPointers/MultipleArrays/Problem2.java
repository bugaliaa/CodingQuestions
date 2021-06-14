package InterviewBit.TwoPointers.MultipleArrays;

// https://www.interviewbit.com/problems/intersection-of-sorted-arrays/
// Intersection of two sorted arrays

import java.util.*;

public class Problem2 {
    public ArrayList<Integer> intersect(final List<Integer> A, final List<Integer> B) {
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0; int j = 0;

        while(i < A.size() && j < B.size()){
            long x = (long)A.get(i);
            long y = (long)B.get(j);
            if(x == y){
                list.add(A.get(i));
                i++;
                j++;
            }else if(x < y) i++;
            else j++;
        }

        return list;
    }
}
