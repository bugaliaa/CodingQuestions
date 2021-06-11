package InterviewBit.Strings.StringSearch;

// https://www.interviewbit.com/problems/amazing-subarrays/
// Amazing Subarrays

public class Problem1 {
    public int solve(String A) {
        char[] c = A.toCharArray();
        int ans = 0;
        int mod = 10003;
        for(int i = 0; i < c.length; i++){
            if(isVowel(c[i])){
                ans += (((c.length-1) - i)+1)%mod;
            }
        }
        return ans%mod;
    }
    public boolean isVowel(char c){
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'; 
    }
}


// s i d d h a n t
// 0 1 2 3 4 5 6 7