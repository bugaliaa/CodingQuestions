package InterviewBit.TwoPointers.InplaceUpdate;

// https://www.interviewbit.com/problems/remove-duplicates-from-sorted-array/
// Remove Duplicates from sorted array

import java.util.*;

public class Problem1 {
    public int removeDuplicates(ArrayList<Integer> a) {
        int i = 0;
        for(int j = 1; j < a.size(); j++){
            if(a.get(i) != a.get(j)){
                i++;
                a.set(i, a.get(j));
            }
        }
        return i+1;
    }
}
