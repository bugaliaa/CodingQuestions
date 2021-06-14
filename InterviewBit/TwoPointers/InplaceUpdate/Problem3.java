package InterviewBit.TwoPointers.InplaceUpdate;

// https://www.interviewbit.com/problems/remove-element-from-array/
// Remove Element from Array

import java.util.*;

public class Problem3 {
    public int removeElement(ArrayList<Integer> a, int b) {
        int i = 0;
        for(int j = 0; j < a.size(); j++){
            if(a.get(j) != b){
                a.set(i, a.get(j));
                i++;
            }
        }
        return i;
    }
}
