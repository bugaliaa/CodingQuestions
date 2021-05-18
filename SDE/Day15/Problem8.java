package SDE.Day15;

// Rabin-Karp Algorithm for String matching (GFG)
// https://www.geeksforgeeks.org/rabin-karp-algorithm-for-pattern-searching/

public class Problem8 {
    public static void main(String[] args) {
        String text = "hello";
        String pattern = "lo";
        rabinKarpAlgo(text, pattern);
    }
    public static void rabinKarpAlgo(String text, String pattern){
        int q = 101; // prime number;
        final int d = 256; // number of characters in alphabets
        int m = text.length();
        int n = pattern.length();
        int p = 0; // hash value of pattern
        int t = 0; // hash value of text
        int h = 1;

        for(int i = 0; i < n-1; i++) h = (h*d)%q;

        for(int i = 0; i < n; i++){
            p = (d*p + pattern.charAt(i))%q;
            t = (d*t + text.charAt(i))%q;
        }

        for(int i = 0; i <= m-n; i++){
            if(p == t){
                int j = 0;
                for(; j < n; j++){
                    if(text.charAt(i+j) != pattern.charAt(j)) break;
                }
                if(j == n) System.out.println(i); // found
            }
            if(i < m-n){
                t = (d*(t-text.charAt(i)*h) + text.charAt(i+n))%q;
                if(t < 0) t = t+q;
            }
        }
    }
}
