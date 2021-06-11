package InterviewBit.Strings.Words;

// https://www.interviewbit.com/problems/reverse-the-string/
// Reverse the String

public class Problem2 {
    public String solve(String A) {
        if(A == null) return null;

        char[] a = A.toCharArray();
        reverse(a, 0, a.length-1);
        reverseWords(a, a.length);

        return cleanSpaces(a, a.length);
    }
    public void reverseWords(char[] a, int n){
        int i = 0;
        int j = 0;
        while(i < n){
            while(i < j || i < n && a[i] == ' ') i++;
            while(j < i || j < n && a[j] != ' ') j++;

            reverse(a, i, j-1);
        }
    }
    public void reverse(char[] a, int l, int r){
        while(l < r){
            char temp = a[l];
            a[l] = a[r];
            a[r] = temp;
            l++;
            r--;
        }
    }
    public String cleanSpaces(char[] a, int n){
        int i = 0;
        int j = 0;

        while(j < n){
            while(j < n && a[j] == ' ') j++;
            while(j < n && a[j] != ' ') a[i++] = a[j++];
            while(j < n && a[j] == ' ') j++;
            if(j < n) a[i++] = ' ';
        }

        return new String(a).substring(0, i);
    }
}
