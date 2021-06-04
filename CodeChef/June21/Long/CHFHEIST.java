package CodeChef.June21.Long;

import java.util.Scanner;

public class CHFHEIST {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int D = sc.nextInt();
            int d = sc.nextInt();
            int P = sc.nextInt();
            int Q = sc.nextInt();

            System.out.println(d + D + P + Q);
        }
        sc.close();
    }
}
