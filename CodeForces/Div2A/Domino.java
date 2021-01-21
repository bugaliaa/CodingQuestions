package CodeForces.Div2A;

import java.util.*;

public class Domino {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x[] = new int[n];
        int y[] = new int[n];

        int l = 0;
        int r = 0;

        boolean s = false;

        for(int i = 0; i < n; i++){
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();

            if(x[i]%2 + y[i]%2 == 1) s = true;

            l += x[i];
            r += y[i];
        }
        sc.close();

        if(l%2 == 0 && r%2 == 0) System.out.println(0);
        else if(l%2 == 1 && r%2 == 1 && s) System.out.println(1);
        else System.out.println(-1);
        
    }
}
