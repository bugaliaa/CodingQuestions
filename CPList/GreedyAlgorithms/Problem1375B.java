package CPList.GreedyAlgorithms;

import java.util.Scanner;

public class Problem1375B {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t = sc.nextInt();
        while(t-- > 0){
            solve();
        }
        sc.close();
    }
    public static void solve(){
        int n = sc.nextInt();
        int m = sc.nextInt();

        int a[][] = new int[n][m];
        int N[][] = new int[n][m];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                a[i][j] = sc.nextInt();
                N[i][j] = countNeighbours(N, i, j, n, m);
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(a[i][j] > N[i][j]){
                    System.out.println("NO");
                    return;
                }
                a[i][j] = N[i][j];
            }
        }
        System.out.println("YES");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int countNeighbours(int[][] N, int i, int j, int n, int m){
        int c = 0;
        if(i-1 >= 0) c++;
        if(i+1 < n) c++;
        if(j-1 >= 0) c++;
        if(j+1 < m) c++;

        return c;
    }
}
