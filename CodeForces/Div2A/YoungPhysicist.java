package CodeForces.Div2A;

import java.util.Scanner;

public class YoungPhysicist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int v[][] = new int[n][3];
                
        for(int i = 0; i < n; i++){
            for(int j = 0; j < 3; j++){
                v[i][j] = sc.nextInt();
            }
        }
        sc.close();
        int sum[] = {0, 0, 0};
        for(int i = 0; i < n; i++){
            sum[0] += v[i][0];
            sum[1] += v[i][1];
            sum[2] += v[i][2];
        }
        if(sum[0] == 0 && sum[1] == 0 && sum[2] == 0) System.out.println("YES");
        else System.out.println("NO");

    }
}
