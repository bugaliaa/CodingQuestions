package InterviewBit.Strings.StringParsing;

// https://www.interviewbit.com/problems/valid-ip-addresses/
// Valid ip addresses

import java.util.*;

public class Problem4 {
    public ArrayList<String> restoreIpAddresses(String A) {
        ArrayList<String> res = new ArrayList<>();
        if(A.length() > 12 || A.length() < 4) return res;

        for(int i = 1; i <= 3; i++){
            for(int j = 1; j <= 3; j++){
                for(int k = 1; k <= 3; k++){
                    for(int l = 1; l <= 3; l++){
                        if(i+j+k+l > A.length() || i+j+k+l < A.length()) continue;
                        String a = A.substring(0, i);
                        String b = A.substring(i, j);
                        String c = A.substring(i+j, k);
                        String d = A.substring(i+j+k, l);

                        if(Integer.parseInt(a) > 255 || Integer.parseInt(b) > 255 || Integer.parseInt(c) > 255 || Integer.parseInt(d) > 255)
                            continue;
                        if((a.charAt(0) == '0' && a.length() > 1) ||
                            (b.charAt(0) == '0' && b.length() > 1) ||
                            (c.charAt(0) == '0' && c.length() > 1) ||
                            (d.charAt(0) == '0' && d.length() > 1)) continue;

                        res.add(a + "." + b + "." + c + "." + d);
                    }
                }
            }
        }

        return res;
    }
}
