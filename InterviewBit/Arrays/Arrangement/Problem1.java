package InterviewBit.Arrays.Arrangement;

// https://www.interviewbit.com/problems/largest-number/
// Largest Number

import java.util.*;

public class Problem1 {
    public String largestNumber(final List<Integer> A) {
        List<String> list = new ArrayList<>();
        for(int i: A){
            list.add(Integer.toString(i));
        }
        Collections.sort(list, new Comparator<String>(){
            @Override
            public int compare(String x, String y){
                String xy = x+y;
                String yx = y+x;

                return xy.compareTo(yx) > 0 ? -1 : 1;
            }
        });
        StringBuilder sb = new StringBuilder();
        for(String s: list) sb.append(s);
        if(sb.charAt(0) == '0') return "0";
        return sb.toString();
    }
}
