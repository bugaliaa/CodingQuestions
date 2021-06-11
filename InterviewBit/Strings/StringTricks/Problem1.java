package InterviewBit.Strings.StringTricks;

// https://www.interviewbit.com/problems/minimum-characters-required-to-make-a-string-palindromic/
// Minimum Characters Required to make a string palindromic

public class Problem1 {
    public int solve(String A) {
        if(A.length() <= 1) return 0;

        StringBuilder sb = new StringBuilder();
        sb.append(A);
        String rev = sb.reverse().toString();
        sb.reverse().append("&").append(rev);

        String temp = sb.toString();
        
        int lps[] = new int[temp.length()];

        int index = 0;
        int i = 1;

        while(i < temp.length()){
            if(temp.charAt(i) == temp.charAt(index)){
                lps[i] = index+1;
                i++;
                index++;
            }else{
                if(index != 0) index = lps[index-1];
                else{ 
                    lps[index] = 0;
                    i++;
                }
            }
        }

        return A.length()-lps[lps.length-1];
    }
}
