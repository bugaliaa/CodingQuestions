package StringProbs;

import java.util.*;

public class SupersetOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        solve(str, 0, "");
    }
    public static void solve(String s, int i, String cur){
        if(i == s.length()){
            System.out.println(cur);
            return;
        }

        solve(s, i+1, cur+s.charAt(i));
        solve(s, i+1, cur);
    }
}
