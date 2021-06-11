package InterviewBit.Strings.StringMath;

// https://www.interviewbit.com/problems/multiply-strings/
// Multiply Strings

public class Problem5 {
    public String multiply(String A, String B) {
        StringBuilder sb = new StringBuilder();
        int n = A.length();
        int m = B.length();
        int res[] = new int[n+m];
        
        if(n == 0 || m == 0) return "0";

        int i_n = 0;
        int i_m = 0;

        for(int i = n-1; i >= 0; i--){
            int carry = 0;
            int n1 = A.charAt(i)-'0';

            i_m = 0;
            for(int j = m-1; j >= 0; j--){
                int n2 = B.charAt(j)-'0';
                int sum = n1*n2 + carry + res[i_n + i_m];
                carry = sum/10;
                res[i_n + i_m] = sum%10;
                i_m++;
            }

            if(carry > 0){
                res[i_n + i_m] += carry;
            }

            i_n++;
        }

        int i = res.length-1;
        while(i >= 0 && res[i] == 0) i--;

        if(i == -1) return "0";

        while(i >= 0){
            sb.append(res[i]);
            i--;
        }

        return sb.toString();
    }
}
