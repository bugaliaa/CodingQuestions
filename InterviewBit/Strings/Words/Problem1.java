package InterviewBit.Strings.Words;

// https://www.interviewbit.com/problems/length-of-last-word/
// Length of Last Word

public class Problem1 {
    public int lengthOfLastWord(final String A) {
        int n = A.length();
        int i = n-1;
        
        while(i >= 0 && A.charAt(i) == ' ') i--;
        
        if(i == -1) return 0;

        int len = 0;
        while(i >= 0 && A.charAt(i) != ' '){
            len++;
            i--;
        }

        return len;
    }
}
