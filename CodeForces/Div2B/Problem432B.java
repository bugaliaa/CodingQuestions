package CodeForces.Div2B;

import java.util.Scanner;

public class Problem432B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int teams[][] = new int[n][2];
        for(int i = 0; i < n; i++){
            teams[i][0] = sc.nextInt();
            teams[i][1] = sc.nextInt();
        }
        sc.close();
    }
}
