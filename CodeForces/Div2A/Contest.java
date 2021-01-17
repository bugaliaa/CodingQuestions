package CodeForces.Div2A;

import java.util.Scanner;

public class Contest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        sc.close();

        int M = Math.max((3*a)/10, a - (a/250)*c);
        int V = Math.max((3*b)/10, b - (b/250)*d);

        if(M > V) System.out.println("Misha");
        else if(M < V) System.out.println("Vasya");
        else System.out.println("Tie");
    }
}
