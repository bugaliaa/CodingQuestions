package InterviewBit.Arrays.MissingRepeated;

// https://www.interviewbit.com/problems/n3-repeat-number/
// n/3 Repeating number

import java.util.*;

public class Problem3 {
    public int repeatedNumber(final List<Integer> a) {
        int c1 = 0;
        int c2 = 0;
        int n1 = -1;
        int n2 = -1;

        for(int i: a){
            if(i == n1) c1++;
            else if(i == n2) c2++;
            else if(c1 == 0){
                n1 = i;
                c1 = 1;
            }else if(c2 == 0){
                n2 = i;
                c2 = 1;
            }else{
                c1--;
                c2--;
            }
        }

        c1 = 0;
        c2 = 0;
        for(int i: a){
            if(i == n1) c1++;
            else if(i == n2) c2++;
        }

        if(c1 > a.size()/3) return n1;
        if(c2 > a.size()/3) return n2;

        return -1;
    }
}
