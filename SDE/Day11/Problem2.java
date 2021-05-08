package SDE.Day11;

// https://practice.geeksforgeeks.org/problems/median-in-a-row-wise-sorted-matrix1527/1#
// Median in a row wise sorted matrix (GFG)

import java.util.*;

public class Problem2 {
    public static void main(String[] args) {
        int[][] matrix = {{1,3,5}, {2,6,9}, {3,6,9}};
        System.out.println(median(matrix, 3, 3));
    }
    public static int median(int matrix[][], int r, int c) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < r; i++){
            if(matrix[i][0] < min) min = matrix[i][0];
            if(matrix[i][c-1] > max) max = matrix[i][c-1];
        }
        int desired = (r*c+1)/2;
        while(min < max){
            int mid = min + (max - min)/2;
            int place = 0;
            int get = 0;

            for(int i = 0; i < r; i++){
                get = Arrays.binarySearch(matrix[i], mid);

                if(get < 0) get = Math.abs(get)-1;
                else{
                    while(get < matrix[i].length && mid == matrix[i][get]) get++;
                }
                place = place + get;
            }
            if(place < desired) min = mid+1;
            else max = mid;
        }
        return min;
    }
}
