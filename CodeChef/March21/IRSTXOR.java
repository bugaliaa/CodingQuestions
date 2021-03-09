package CodeChef.March21;

import java.util.Scanner;

public class IRSTXOR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long c = sc.nextLong();
            long temp = c;
            long i = 0;
            while(temp > 0){
                temp /= 2;
                i++;
            }
            long a = (long)Math.pow(2, i-1) - 1;
            long b = a ^ c;
            System.out.println(a*b);
        }
        sc.close();
    }
}
