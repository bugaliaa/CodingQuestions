package InterviewBit.TwoPointers.MultipleArrays;

// https://www.interviewbit.com/problems/merge-two-sorted-lists-ii/
// Merge Two Sorted Lists II

import java.util.*;

public class Problem1 {
    public void merge(ArrayList<Integer> a, ArrayList<Integer> b) {
        int n1 = a.size();
        int n2 = b.size();
        int i, j;
        int gap = n1+n2;

        for(gap = nextGap(gap); gap > 0; gap = nextGap(gap)){
            for(i = 0; i + gap < n1; i++){
                if(a.get(i) > a.get(i+gap)){
                    int temp = a.get(i);
                    a.set(i, a.get(i+gap));
                    a.set(i+gap, temp);
                }
            }
            for(j = gap > n1 ? gap-n1 : 0; i < n1 && j < n2; i++, j++){
                if(a.get(i) > b.get(j)){
                    int temp = a.get(i);
                    a.set(i, b.get(j));
                    b.set(j, temp);
                }
            }
            if(j < n2){
                for(j = 0; j+gap < n2; j++){
                    if(b.get(j) > b.get(j+gap)){
                        int temp = b.get(j);
                        b.set(j, b.get(j+gap));
                        b.set(j+gap, temp);
                    }
                }
            }
        }
        for(i = 0; i < n2; i++) a.add(b.get(i));
    }
    public int nextGap(int gap){
        if(gap <= 1) return 0;
        return (gap/2) + (gap%2);
    }
}
