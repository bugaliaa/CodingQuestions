package InterviewBit.Strings.StringTricks;

// https://www.interviewbit.com/problems/minimum-appends-for-palindrome/
// Minimum Appends for Palindrome

public class Problem3 {
    public int solve(String A) {
        int l = 0;
        int r = A.length()-1;
        int temp = 0;
        
        while(l <= r){
            if(A.charAt(l) != A.charAt(r)){
                r = A.length()-1;
                temp++;
                l = temp;
            }else{
                l++;
                r--;
            }
        }

        return temp;
    }
}
