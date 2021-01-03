package CodeForces.Div2A;

import java.util.Scanner;

public class Watermelon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        sc.close();
        if(((w ^ 1) == w + 1) && w != 2) System.out.println("YES");
        else System.out.println("NO");
    }
}
