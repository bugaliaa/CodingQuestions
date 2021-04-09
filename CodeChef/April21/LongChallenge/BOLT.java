package CodeChef.April21.LongChallenge;

import java.util.Scanner;

public class BOLT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            float k1 = sc.nextFloat();
            float k2 = sc.nextFloat();
            float k3 = sc.nextFloat();
            float v = sc.nextFloat();
            float c = 9.58f;
            float c1 = v*k1*k2*k3;
            c1 = 100/c1;
            c1 = (int)(c1*100 + .5);
            c1 = c1/100;
            if(c > c1) System.out.println("YES");
            else System.out.println("NO");
        }
        sc.close();
    }
}
