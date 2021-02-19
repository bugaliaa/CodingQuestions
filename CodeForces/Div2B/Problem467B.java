package CodeForces.Div2B;

import java.util.Scanner;

public class Problem467B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        
        long soldiers[] = new long[m+1];
        int c = 0;
        for(int i = 0; i <= m; i++){
            soldiers[i] = sc.nextInt();
        }
        sc.close();

        for(int i = 0; i < m; i++){
            long x = soldiers[i]^soldiers[m];
            if(countOne(x) <= k) c++;
        }
        System.out.println(c);
    }

    private static int countOne(long x) {
        int k = 0;
        while(x != 0){
            x = x&(x-1);
            k++;
        }
        return k;
    }
}
