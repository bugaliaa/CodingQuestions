package CodeForces.Div2A;

import java.util.Scanner;

public class PlayingWithDice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        int f = 0;
        int s = 0;
        int d = 0;
        for(int i = 1; i <= 6; i++){
            if(Math.abs(a - i) < Math.abs(b - i)) f++;
            else if(Math.abs(b - i) < Math.abs(a - i)) s++;
            else d++;
        }
        System.out.println(f + " " + d + " " + s);
    }
}
