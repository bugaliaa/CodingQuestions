package InterviewBit.TwoPointers.InplaceUpdate;

// https://www.interviewbit.com/problems/sort-by-color/
// Sort By Color

import java.util.*;

public class Problem4 {
    public void sortColors(ArrayList<Integer> a) {
        int low = 0;
        int mid = low;
        int high = a.size()-1;
        while(mid <= high){
            if(a.get(mid) == 0){
                swap(a, mid, low);
                low++;
                mid++;
            }else if(a.get(mid) == 1) mid++;
            else{
                swap(a, mid, high);
                high--;
            }
        }
    }
    public void swap(ArrayList<Integer> a, int i, int j){
        int temp = a.get(i);
        a.set(i, a.get(j));
        a.set(j, temp);
    }
}
