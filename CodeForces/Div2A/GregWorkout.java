package CodeForces.Div2A;

import java.util.Scanner;

public class GregWorkout {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
        }
        sc.close();
        int ex[] = new int[3];
        for(int i = 0; i < n; i++){
            if(i%3 == 0) ex[0] += a[i];
            else if(i%3 == 1) ex[1] += a[i];
            else ex[2] += a[i];
        }
        int max = Math.max(ex[0], Math.max(ex[1], ex[2]));
        if(max == ex[0]) System.out.println("chest");
        else if(max == ex[1]) System.out.println("biceps");
        else System.out.println("back");
    }
}
