package CodeForces.Div2A;

import java.util.Scanner;

public class Expression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();
        
        int ar[] = {a+b+c, a+b*c, a*b+c, (a+b)*c, a*(b+c), a*b*c};
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < ar.length; i++){
            max = Math.max(max, ar[i]);
        }
        System.out.println(max);
    }
}
