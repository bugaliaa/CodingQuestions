package InterviewBit.TwoPointers.InplaceUpdate;

// https://www.interviewbit.com/problems/remove-duplicates-from-sorted-array-ii/
// Remove Duplicates from Sorted Array II

import java.util.*;

public class Problem2 {
    public int removeDuplicates(ArrayList<Integer> a) {
        if(a.size() <= 2) return a.size();
        int i = 2;
        for(int j = 2; j < a.size(); j++){
            if((long)a.get(i-2) != (long)a.get(j)){
                a.set(i++, a.get(j));
            }
        }
        return i;
    }
}
