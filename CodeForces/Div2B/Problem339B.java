package CodeForces.Div2B;

import java.util.Scanner;

public class Problem339B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int a = 1;
        long ans = 0;
        for(int i = 0; i < m; i++){
            int b = sc.nextInt();
            if(b >= a) ans += b - a;                
            else ans += n - (a-b);
            
            a = b;
        }
        sc.close();
        
        System.out.println(ans);
    }
}
