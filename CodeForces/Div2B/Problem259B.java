package CodeForces.Div2B;

import java.util.Scanner;

public class Problem259B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[3][3];
        int rowSum = 0;

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                a[i][j] = sc.nextInt();
                rowSum += a[i][j];
            }            
        }
        sc.close();
        
        rowSum /= 2;
        a[0][0] = rowSum - a[0][1] - a[0][2];
        a[1][1] = rowSum - a[1][0] - a[1][2];
        a[2][2] = rowSum - a[2][0] - a[2][1];
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++) System.out.print(a[i][j] + " ");
            System.out.println();
        }
    }
}
