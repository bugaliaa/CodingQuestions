package SDE.Day3;

// https://www.geeksforgeeks.org/search-in-row-wise-and-column-wise-sorted-matrix/
// Search in a row wise and column wise sorted matrix

public class Problem2 {
    public static void main(String[] args) {
        int matrix[][] = { { 10, 20, 30, 40 },
                        { 15, 25, 35, 45 },
                        { 27, 29, 37, 48 },
                        { 32, 33, 39, 50 } };
        System.out.println(search(matrix, 25));
    }
    public static boolean search(int[][] matrix, int target){
        int i = 0;
        int j = matrix[0].length -1;
        while(i < matrix.length && j >= 0){
            if(matrix[i][j] == target) return true;
            if(matrix[i][j] > target) j--;
            else i++;
        }
        return false;
    }
}
