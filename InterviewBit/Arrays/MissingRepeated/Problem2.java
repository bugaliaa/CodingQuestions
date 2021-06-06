package InterviewBit.Arrays.MissingRepeated;

// https://www.interviewbit.com/problems/repeat-and-missing-number-array/
// Repeat and Missing Number Array

import java.util.*;

public class Problem2 {
    public ArrayList<Integer> repeatedNumber(final List<Integer> A) {
        int n = A.size();
        int x = 0;
        int y = 0;
        int xor = 0;
        ArrayList<Integer> list = new ArrayList<>();

        for(int i: A) xor ^= i;
        for(int i = 1; i <= n; i++) xor ^= i;
        
        int setBit = xor & ~(xor-1);
        for(int i: A){
            if((i&setBit) != 0) x ^= i;
            else y ^= i;
        }
        
        for(int i = 1; i <= n; i++){
            if((i&setBit) != 0) x ^= i;
            else y ^= i;
        }
        
        int mis = 0;
        int rep = 0;

        for(int i: A){
            if(i == x){
                rep = x;
                mis = y;
                break;
            }else if(i == y){
                rep = y;
                mis = x;
                break;
            }
        }
        list.add(rep);
        list.add(mis);
        return list;
    }
}
