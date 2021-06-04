package CodeChef.June21.Long;

import java.util.Scanner;

public class COCONUT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int xa = sc.nextInt();
            int xb = sc.nextInt();
            int Xa = sc.nextInt();
            int Xb = sc.nextInt();

            int a = Xa/xa;
            int b = Xb/xb;

            System.out.println(a+b);
        }
        sc.close();
    }
}
