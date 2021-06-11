package InterviewBit.Strings.StringSearch;

// https://www.interviewbit.com/problems/implement-strstr/
// Implement strstr

public class Problem2 {
    public int strStr(final String s, final String pat) {
        if(s.isEmpty() || pat.isEmpty()) return -1;

        int[] lps = lspArray(pat);

        int i = 0;
        int j = 0;
        int n = s.length();
        int m = pat.length();
        while(i < n){
            if(s.charAt(i) == pat.charAt(j)){
                i++;
                j++;
            }
            if(j == m){
                return i-j;
            }else if(i < n && pat.charAt(j) != s.charAt(i)){
                if(j != 0) j = lps[j-1];
                else i = i+1;
            }
        }

        return -1;
    }
    public int[] lspArray(String s){
        int n = s.length();
        int[] lsp = new int[n];

        int i = 1;
        int j = 0;
        lsp[0] = 0;

        while(i < n){
            if(s.charAt(i) == s.charAt(j)){
                j++;
                lsp[i] = j;
                i++;
            }else{
                if(j != 0) j = lsp[j-1];
                else{
                    lsp[i] = 0;
                    i++;
                }
            }
        }

        return lsp;
    }
}
