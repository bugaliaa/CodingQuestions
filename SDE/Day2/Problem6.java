package SDE.Day2;

// https://leetcode.com/problems/rotate-image
// Rotate Image/ Rotate Matrix

public class Problem6 {
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3},{4,5,6},{7,8,9}};
        rotate(matrix);
        for(int[] i: matrix){
            for(int j: i) System.out.print(j + " ");
            System.out.println();
        }
    }
    public static void rotate(int[][] matrix) {
        for(int i = 0; i < matrix.length; i++){
            for(int j = i; j < matrix.length; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        reverse(matrix);
    }
    public static void reverse(int[][] matrix){
        for(int i = 0; i < matrix.length; i++){
            int l = 0;
            int r = matrix.length-1;
            while(l <= r){
                int temp = matrix[i][l];
                matrix[i][l] = matrix[i][r];
                matrix[i][r] = temp;
                l++;
                r--;
            }
        }
    }
}
