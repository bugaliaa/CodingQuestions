package SDE.Day2;

import java.util.Scanner;

// https://leetcode.com/problems/set-matrix-zeroes/
// Set Matrix Zeroes

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int matrix[][] = new int[m][n];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++) matrix[i][j] = sc.nextInt();
        }
        sc.close();

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++) System.out.print(matrix[i][j] + " ");
            System.out.println();
        }
    }
    public static void setZeroes(int[][] matrix) {
        boolean col = true;
        int rows = matrix.length;
        int cols = matrix[0].length;

        for(int i = 0; i < rows; i++){
            if(matrix[i][0] == 0) col = false;
            for(int j = 1; j < cols; j++){
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        for(int i = rows-1; i >= 0; i--){
            for(int j = cols-1; j >= 1; j--){
                if(matrix[i][0] == 0 || matrix[0][j] == 0) matrix[i][j] = 0;
            }
            if(!col) matrix[i][0] = 0;
        }
    }
}
