package CodeChef.April21.LongChallenge;

import java.util.Scanner;

public class SDICE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long ans = 0;
        while(t-- > 0){
            long n = sc.nextLong();
            long rem = n%4;
            long mult = n/4;
            if(n == 1) ans = 20;
            else if(n == 2) ans = 2*(3+4+5+6);
            else if(n == 3) ans = 2*(3+4+5+6) + (4+5+6);
            else if(n >= 4){
                if(rem == 0){
                    ans = (4*mult*(6 + 5)) + (4*4);
                }else if(rem == 1){
                    ans = 4*mult*(6 + 5) + (3*4) + (6+5+4+3+2);
                }else if(rem == 2){
                    ans = 4*mult*(6 + 5) + (2*4) + (2*(6+5+4+3));
                }else if(rem == 3){
                    ans = 4*mult*(6 + 5) + 4 + ((2*(6+5+4+3))+(6+5+4));
                }
            }
            System.out.println(ans);
        }
        sc.close();
    }
}
