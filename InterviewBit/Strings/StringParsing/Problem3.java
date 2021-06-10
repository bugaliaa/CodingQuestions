package InterviewBit.Strings.StringParsing;

// https://www.interviewbit.com/problems/atoi/
// Atoi

public class Problem3 {
    public int atoi(final String A) {
        char[] s = A.toCharArray();
        int sign = 1;
        int base = 0;
        int i = 0;

        while(s[i] == ' ') i++;

        if(s[i] == '-' || s[i] == '+') sign = 1 - 2*(s[i] == '-' ? 1 : 0);

        while(i < s.length && s[i] <= '9' && s[i] >= '0'){
            if(base > Integer.MAX_VALUE/10 || (base == Integer.MAX_VALUE && s[i] - '0' > 7)){
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            base = base*10 + (s[i++] - '0');
        }

        return base*sign;
    }
}
