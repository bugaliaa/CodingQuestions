package CodeForces.Div2A;

import java.util.*;

public class TeamOlympiad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t[][] = new int[4][n];
        int m[] = new int[4];
        for(int i = 1; i <= n; i++){
            int a = sc.nextInt();
            t[a][m[a]++] = i;
        }
        sc.close();

        int ans = Math.min(m[1], Math.min(m[2], m[3]));
        
        System.out.println(ans);
        for(int i = 0; i < ans; i++){
            System.out.println(t[1][i] + " " + t[2][i] + " " + t[3][i]);
        }
    }
}
