package CodeChef.Feb21.Starters;

import java.util.Scanner;

public class MVALUE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int A = Integer.MIN_VALUE;
            int B = Integer.MIN_VALUE;
            for(int i = 0; i < n-1; i+=2){
                int x = sc.nextInt();
                int y = sc.nextInt();
                A = Math.max(A, x);
                B = Math.max(B, y);
            }
            System.out.println((A*B) + Math.max(A-B, B-A));
        }
        sc.close();
    }
}
