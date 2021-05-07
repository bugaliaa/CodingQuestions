package CodeChef.May21.LC;

import java.util.Scanner;

public class SOLBLTY {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int x = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();

            long ans = (a + ((100 - x)*b))*10;
            System.out.println(ans);
        }
        sc.close();
    }
}
