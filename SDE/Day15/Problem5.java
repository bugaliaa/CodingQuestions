package SDE.Day15;

// https://practice.geeksforgeeks.org/problems/implement-atoi/1
// String to integer atoi (GFG)

public class Problem5 {
    public static void main(String[] args) {
        String s = "42aaa";
        System.out.println(atoi(s));
    }
    public static int atoi(String str) {
        int sign = 1;
        int i = 0;
        int base = 0;
        char[] s = str.toCharArray();

        while(s[i] == ' ') i++;
        if(s[i] == '+' || s[i] == '-' && i < s.length){
            sign = s[i] == '+' ? 1 : -1;
            i++;
        }
        
        while(i < s.length && s[i] >= '0' && s[i] <= '9'){
            if(base > Integer.MAX_VALUE/10 || base == Integer.MAX_VALUE && s[i] - '0' > 7){
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            base = 10*base + (s[i++] - '0');
        }
        if(i < s.length && !Character.isDigit(s[i])) return -1;
        return base*sign;
    }    
}
