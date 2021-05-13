package CodeChef.May21.LC;

import java.util.Scanner;

public class MODEQ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int pairs = 0;
            
            for(int b = n; b >= 2; b--){
                int y = m%b;
                int a = 1;
                while(a < b){
                    if((m-y)%a == 0) pairs++;
                    a++;
                }
            }
            System.out.println(pairs);
        }
        sc.close();
    }
}
