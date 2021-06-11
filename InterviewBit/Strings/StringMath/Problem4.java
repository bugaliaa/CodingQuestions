package InterviewBit.Strings.StringMath;

// https://www.interviewbit.com/problems/power-of-2/
// Power of 2

public class Problem4 {
    public int power(String A) {
        int n = A.length();

        int num = A.charAt(0) - '0';
        for(int i = 1; i < n; i++) num = (num*10) + (A.charAt(i) - '0');

        if(num == 1) return 0;

        if((num&(num-1)) == 0) return 1;

        return 0;
    }
}
