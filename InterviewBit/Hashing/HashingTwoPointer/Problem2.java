package InterviewBit.Hashing.HashingTwoPointer;

// https://www.interviewbit.com/problems/window-string/
// Window String

public class Problem2 {
    public String minWindow(String A, String B) {
        int table[] = new int[256];

        for(char c: B.toCharArray()) table[c]++;

        int l = 0;
        int f = 0;
        int count = B.length();
        int r = 0;
        int len_Min = Integer.MAX_VALUE;
        boolean check = false;

        while(r < A.length()){
            if(table[A.charAt(r)] > 0) count--;

            table[A.charAt(r)]--;
            r++;
            if(count == 0) check = true;

            while(count == 0){
                if(r - l < len_Min){
                    len_Min = r-l;
                    f = l;
                }
                if(table[A.charAt(l)] >= 0) count++;

                table[A.charAt(l)]++;
                l++;
            }
        }

        if(check) return A.substring(f, len_Min);
        return "";
    }
}
