package InterviewBit.Strings.StringSimulation;

// https://www.interviewbit.com/problems/vowel-and-consonant-substrings/
// Vowel and Consonant Substrings

public class Problem2 {
    public int solve(String A) {
        long res = 0;
        int v = 0;
        int c = 0;

        for(char i: A.toCharArray()){
            if(i == 'a' || i == 'e' || i == 'i' || i == 'o' || i == 'u'){
                v++;
                res += c;
            }else{
                c++;
                res += v;
            }
        }

        return (int)(res%1000000007);
    }
}
