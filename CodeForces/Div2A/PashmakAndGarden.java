package CodeForces.Div2A;

import java.util.Scanner;

public class PashmakAndGarden {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        sc.close();

        int xDiff = x1 - x2;
        int yDiff = y1 - y2;

        int x3, y3, x4, y4;

        if(xDiff != 0 && yDiff != 0){
            x3 = x1;
            y3 = y2;
            x4 = x2;
            y4 = y1;
        }else if(xDiff != 0){
            x3 = x1;
            y3 = y1 + Math.abs(xDiff);
            x4 = x2;
            y4 = y2 + Math.abs(xDiff);
        }else{
            x3 = x1 + Math.abs(yDiff);
            y3 = y1;
            x4 = x2 + Math.abs(yDiff);
            y4 = y2;
        }
        if(xDiff != 0 && yDiff != 0 && Math.abs(xDiff) != Math.abs(yDiff)) System.out.println(-1);
        else System.out.println(x3 + " " + y3 + " " + x4 + " " + y4 + " ");
    }
}
