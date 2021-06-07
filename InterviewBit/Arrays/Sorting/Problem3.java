package InterviewBit.Arrays.Sorting;

// https://www.interviewbit.com/problems/hotel-bookings-possible/
// Hotel Bookings Possible

import java.util.*;

public class Problem3 {
    public boolean hotel(ArrayList<Integer> arrive, ArrayList<Integer> depart, int K) {
        Collections.sort(arrive);
        Collections.sort(depart);
        int max = 1;
        int count = 1;
        int n = arrive.size();

        int i = 1;
        int j = 0;

        while(i < n && j < n){
            if(arrive.get(i) < depart.get(j)){
                count++;
                i++;
            }else{
                count--;
                j++;
            }
            max = Math.max(max, count);
            if(count > K) return false;
        }

        return true;
    }
}
