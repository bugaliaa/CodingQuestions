package InterviewBit.Strings.StringSimulation;

// https://www.interviewbit.com/problems/longest-common-prefix/
// Longest Common Prefix

import java.util.*;

public class Problem4 {
    public String longestCommonPrefix(ArrayList<String> A) {
        Collections.sort(A);
        String x = A.get(0);
        String y = A.get(A.size()-1);

        int i = 0;
        int j = 0;
        String ans = "";
        while(i < x.length() && j < y.length()){
            if(x.charAt(i) != y.charAt(j)) break;
            ans += x.charAt(i);
            i++;
            j++;
        }
        return ans;
    }
}
