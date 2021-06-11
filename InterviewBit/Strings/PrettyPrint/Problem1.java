package InterviewBit.Strings.PrettyPrint;

// https://www.interviewbit.com/problems/zigzag-string/
// Zigzag String

public class Problem1 {
    public String convert(String A, int B) {
        StringBuilder sb = new StringBuilder();
        if(B == 1) return A;
        for(int i = 0; i < B; i++){
            int j = i;
            int x = 1;
            boolean flag = true;

            while(j < A.length()){
                if(x != 0) sb.append(A.charAt(j));
                x = flag ? 2*(B-i-1) : 2*i;
                j += x;
                flag = !flag;
            }
        }

        return sb.toString();
    }
}
