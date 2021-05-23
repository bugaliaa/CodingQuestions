package CodeChef.May21.CookOff;

import java.util.Scanner;

public class MARARUN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int D = sc.nextInt();
            int d = sc.nextInt();
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            int a = 10;
            int b = 21;
            int c = 42;

            int totalDistance = d*D;
            if(totalDistance >= c){
                System.out.println(C);
            }else if(totalDistance >= b){
                System.out.println(B);
            }else if(totalDistance >= a){
                System.out.println(A);
            }else{
                System.out.println(0);
            }
        }
        sc.close();
    }
}
