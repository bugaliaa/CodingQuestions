package CodeChef.Feb21.Starters;

import java.util.Scanner;

public class Coupon2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int d = sc.nextInt();
            int c = sc.nextInt();
            int s1 = 0;
            for (int i = 0; i < 3; i++)
                s1 += sc.nextInt();
            int s2 = 0;
            for (int i = 0; i < 3; i++)
                s2 += sc.nextInt();

            int withCoupon = 0;
            int withoutCoupon = s1 + s2 + (2 * d);

            if (s1 < 150 && s2 < 150)
                withCoupon = withoutCoupon;
            else if (s1 < 150 || s2 < 150)
                withCoupon = s1 + s2 + c + d;
            else
                withCoupon = s1 + s2 + c;

            if (withCoupon < withoutCoupon) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
