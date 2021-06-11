package InterviewBit.Strings.StringMath;

// https://www.interviewbit.com/problems/add-binary-strings/
// Add Binary Strings

public class Problem3 {
    public String addBinary(String A, String B) {
        int n = A.length();
        int m = B.length();

        if(n < m){
            String t = A;
            A = B;
            B = t;

            int x = n;
            n = m;
            m = x;
        }

        int diff = n - m;
        String t = "";
        while(diff-- > 0) t += "0";
        B = t+B;

        int carry = 0;

        StringBuilder sb = new StringBuilder();
        for(int i = n-1; i >= 0; i--){
            int sum = (A.charAt(i) - '0') + (B.charAt(i) - '0') + carry;
            if(sum == 2){
                sb.append("0");
                carry = 1;
            }else if(sum == 3){
                sb.append("1");
                carry = 1;
            }else if(sum == 1){
                sb.append("1");
                carry = 0;
            }else sb.append("0");
        }

        if(carry == 1) sb.append("1");

        return sb.reverse().toString();
    }
}
