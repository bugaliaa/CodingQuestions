package InterviewBit.Strings.StringSimulation;

// https://www.interviewbit.com/problems/palindrome-string/
// Palindrome String

public class Problem1 {
    public int isPalindrome(String A) {
        int i = 0;
        int j = A.length()-1;
        while(i < j){
            char x = A.charAt(i);
            char y = A.charAt(j);

            if('A' <= x && x <= 'Z') x = Character.toLowerCase(x);
            if('A' <= y && y <= 'Z') y = Character.toLowerCase(y);

            if(!('A' <= x && x <= 'Z') && !('a' <= x && x <= 'z') && !('1' <= x && x <= '9')){
                i++;
                continue;
            }

            if(!('A' <= y && y <= 'Z') && !('a' <= y && y <= 'z') && !('1' <= y && y <= '9')){
                j--;
                continue;
            }

            if(x != y) return 0;

            i++;
            j--;
        }
        return 1;
    }
}
