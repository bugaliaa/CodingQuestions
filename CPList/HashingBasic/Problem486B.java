package CPList.HashingBasic;

import java.util.Scanner;

// https://codeforces.com/problemset/problem/486/B

public class Problem486B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int A[][] = new int[n][m];
        int B[][] = new int[n][m];
        int C[][] = new int[n][m];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                B[i][j] = sc.nextInt();
                A[i][j] = 1;
                C[i][j] = 0;
            }
        }
        sc.close();

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(B[i][j] == 0){
                    for(int k = 0; k < n; k++) A[k][j] = 0;
                    for(int k = 0; k < m; k++) A[i][k] = 0; 
                }
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(A[i][j] == 1){
                    for(int k = 0; k < n; k++) C[k][j] = 1;
                    for(int k = 0; k < m; k++) C[i][k] = 1;
                }
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(B[i][j] != C[i][j]){
                    System.out.println("NO");
                    return;
                }
            }
        }
        System.out.println("YES");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }
}
