package CodeChef.May21.LC;

import java.util.Scanner;

public class XOREQUAL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            System.out.println((int)power(2, n-1, 1000000007));
        }
        sc.close();
    }
    public static long power(long x, long y, int p){
        long res = 1;
        
        x = x%p;
        if(x == 0) return 0;

        while(y > 0){
            if((y&1) != 0) res = (res*x)%p;
            y = y >> 1;
            x = (x*x)%p;
        }
        return res;
    }
}
