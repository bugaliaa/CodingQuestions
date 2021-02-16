// Given a string, find all possible palindromic partitions of given string.

package StringProbs;

import java.util.*;

public class PalindromicPartition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        List<String> list = new ArrayList<>();
        solve(str, list, "");
        for(String s: list) System.out.println(s);
    }

    public static void solve(String str, List<String> list, String curr){

        if(str.length() == 0){
            return;
        }

        for(int i = 0; i < str.length(); i++){
            String prefix = str.substring(0, i+1);
            String rest = str.substring(i+1);
            if(isPalindrome(prefix)){
                list.add(prefix);
                solve(rest, list, curr+"("+prefix+")");
            }
        }
    }
    
    public static boolean isPalindrome(String str){
        int l = 0; int r = str.length()-1;
        while(l < r){
            if(str.charAt(l) != str.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }
}
