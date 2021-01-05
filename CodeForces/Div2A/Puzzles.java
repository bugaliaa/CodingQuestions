package CodeForces.Div2A;

import java.util.*;

public class Puzzles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        int p[] = new int[m];
        for(int i = 0; i < m; i++) p[i] = sc.nextInt();
        sc.close();

        Arrays.sort(p);
        int min = Integer.MAX_VALUE;
        for(int i  = 0; i <= m - n; i++){
            min = Math.min(min, Math.abs(p[i] - p[i+n-1]));
        }
        System.out.println(min);
    }
}
