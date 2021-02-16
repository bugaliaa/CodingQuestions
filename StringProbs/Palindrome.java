package StringProbs;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();

        System.out.println(solve(str, 0, str.length()-1));
    }

    public static boolean solve(String s, int l, int r){
        if(l >= r) return true;

        if(s.charAt(l) != s.charAt(r)) return false;

        return solve(s, l+1, r-1);
    }
}
