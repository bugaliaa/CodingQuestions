package CPList.PrefixSum;

import java.util.Scanner;

public class COW3E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int u = sc.nextInt();
        int q = sc.nextInt();
        int a[][] = new int[n][m];
        int b[][] = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                a[i][j] = sc.nextInt();
                b[i][j] = a[i][j];
            }
        }

        for(int i = 1; i < n; i++) b[i][0] -= a[i-1][0];
        for(int i = 1; i < m; i++) b[0][i] -= a[0][i-1];
        
        for(int i = 1; i < n; i++){
            for(int j = 1; j < m; j++){
                b[i][j] = b[i][j] - a[i-1][j] - a[i][j-1] + a[i-1][j-1];
            }
        }
        while(u-- > 0){
            int k = sc.nextInt();
            int r1 = sc.nextInt();
            int c1 = sc.nextInt();
            int r2 = sc.nextInt();
            int c2 = sc.nextInt();

            if(c2+1 < m) b[r1][c2+1] -= k;
            if(r2+1 < n) b[r2+1][c2] -= k;
            if(r2+1 < n && c2+1 < m) b[r2+1][c2+1] += k;
            
            b[r1][c1] += k;
        }

        for(int i = 1; i < n; i++) b[i][0] += b[i-1][0];
        for(int i = 1; i < m; i++) b[0][i] += b[0][i-1];

        for(int i = 1; i < n; i++){
            for(int j = 1; j < m; j++){
                b[i][j] = b[i][j] + b[i-1][j] + b[i][j-1] - b[i-1][j-1];
            }
        }

        while(q-- > 0){
            int r1 = sc.nextInt();
            int c1 = sc.nextInt();
            int r2 = sc.nextInt();
            int c2 = sc.nextInt();

            int ans = b[r2][c2];
            if(r1-1 >= 0) ans -= b[r1-1][c2];

            if(c1-1 >= 0) ans -= b[r2][c1-1];

            if(r1 - 1 >= 0 && c1 - 1 >= 0) ans += b[r1-1][c1-1];

            System.out.println(ans);
        }
        sc.close();
    }
}
