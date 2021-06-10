package InterviewBit.Strings.StringParsing;

// https://www.interviewbit.com/problems/compare-version-numbers/
// Compare version numbers

public class Problem1 {
    public int compareVersion(String A, String B) {
        double vnum1 = 0;
        double vnum2 = 0;

        for(int i = 0, j = 0; i < A.length() || j < B.length();){
            while(i < A.length() && A.charAt(i) != '.'){
                vnum1 = vnum1*10 + (A.charAt(i) - '0');
                i++;
            }

            while(j < B.length() && B.charAt(j) != '.'){
                vnum2 = vnum2*10 + (B.charAt(j) - '0');
                j++;
            }

            if(vnum1 > vnum2) return 1;
            if(vnum1 < vnum2) return -1;

            vnum1 = vnum2 = 0;
            i++;
            j++;
        }
        return 0;
    }
}
