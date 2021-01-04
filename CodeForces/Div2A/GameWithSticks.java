package CodeForces.Div2A;

import java.util.Scanner;

public class GameWithSticks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.close();

        if(Math.min(n, m)%2 == 0) System.out.println("Malvika");
        else System.out.println("Akshat");
    }
}
