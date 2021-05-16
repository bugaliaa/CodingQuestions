package SDE.Day15;

// https://leetcode.com/problems/reverse-words-in-a-string/
// Reverse words in a string (LeetCode)

public class Problem1 {
    public static void main(String[] args) {
        String s = "a good   example";
        System.out.println(reverseWords(s));
    }
    public static String reverseWords(String s) {
        if(s == null) return null;

        char[] a = s.toCharArray();
        reverse(a, 0, a.length-1);

        reverseWords(a, a.length);

        return cleanSpaces(a, a.length);
    }
    public static String cleanSpaces(char[] a, int n){
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
    public static void reverseWords(char[] a, int n){
        int i = 0;
        int j = 0;
        while(i < n){
            while(i < j || i < n && a[i] == ' ') i++;
            while(j < i || j < n && a[j] != ' ') j++;
            reverse(a, i, j-1);
        }
    }
    public static void reverse(char[] a, int l, int r){
        while(l < r){
            char temp = a[l];
            a[l] = a[r];
            a[r] = temp;
            l++;
            r--;
        }
    }
}
