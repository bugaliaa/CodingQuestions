package StringProbs;

import java.util.Scanner;

public class Permutations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        solve(str, 0, str.length()-1);
    }
    public static void solve(String str, int l, int r){
        if(l == r){
            System.out.println(str);
            return;
        }
        for(int i = l; i <= r; i++){
            str = swap(str, l, i);
            solve(str, l+1, r);
            str = swap(str, l, i);
        }
    }
    public static String swap(String str, int i, int j){
        char[] c = str.toCharArray();
        char temp = c[i];
        c[i] = c[j];
        c[j] = temp;
        return new String(c);
    }
}
