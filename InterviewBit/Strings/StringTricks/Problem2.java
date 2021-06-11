package InterviewBit.Strings.StringTricks;

// https://www.interviewbit.com/problems/convert-to-palindrome/
// Convert to palindrome

public class Problem2 {
    public int solve(String A) {
        int low = 0;
        int high = A.length()-1;

        while(low < high){
            if(A.charAt(low) == A.charAt(high)){
                low++;
                high--;
            }else{
                if(isPalindrome(A, low+1, high) || isPalindrome(A, low, high-1)) return 1;
                return 0;
            }
        }

        return 1;
    }
    
    public boolean isPalindrome(String s, int low, int high){
        while(low < high){
            if(s.charAt(low) != s.charAt(high)) return false;
            low++;
            high--;
        }
        return true;
    }
}
