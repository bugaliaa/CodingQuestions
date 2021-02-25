package CodeForces.Div2B;

import java.util.Scanner;

public class Problem276B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();

        char[] c = str.toCharArray();
        int[] t = new int[27];
        for(int i = 0; i < c.length; i++){
            t[(int)c[i] - 96]++;
        }
        int odd = 0;
        for(int i = 1; i < 27; i++){
            if((t[i]&1) == 1) odd++;
        }
        if(odd == 0 || odd%2 == 1) System.out.println("First");
        else System.out.println("Second");
    }
}