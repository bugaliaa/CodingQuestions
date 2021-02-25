package CodeForces.Div2B;

import java.util.Scanner;

public class Problem486B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] A = new int[m][n];
        int[][] B = new int[m][n];
        int[][] C = new int[m][n];

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                B[i][j] = sc.nextInt();
                A[i][j] = 1;
                C[i][j] = 0;
            }
        }
        sc.close();
        for (int i = 0; i < m; ++i)
    {
    	for (int j = 0; j < n; ++j)
    	{
    		if (B[i][j] == 0)
    		{
    			for (int k = 0; k < n; ++k)
    			{
    				A[i][k] = 0;
    			}
    			for (int k = 0; k < m; ++k)
    			{
    				A[k][j] = 0;
    			}

    		}
    	}
    }
    
    for (int i = 0; i < m; ++i)
    {
    	for (int j = 0; j < n; ++j)
    	{
    		if (A[i][j] == 1)
    		{
    			for (int k = 0; k < n; ++k)
    			{
    				C[i][k] = 1;
    			}
    			for (int k = 0; k < m; ++k)
    			{
    				C[k][j] = 1;
    			}

    		}
    	}
    }
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(C[i][j] != B[i][j]){
                    System.out.println("NO");
                    return;
                }
            }
        }
        System.out.println("YES");
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}