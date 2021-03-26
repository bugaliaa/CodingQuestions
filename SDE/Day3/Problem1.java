package SDE.Day3;

// https://leetcode.com/problems/search-a-2d-matrix/
// Search in a 2D Matrix

public class Problem1 {
    public static void main(String[] args) {
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        System.out.println(searchMatrix(matrix, 11));
    }
    public static boolean searchMatrix(int[][] matrix, int target) {
        for(int i[]: matrix){
            if(binarySearch(i, target)) return true;
        }
        return false;
    }
    public static boolean binarySearch(int[] temp, int target){
        int l = 0;
        int r = temp.length-1;
        while(l <= r){
            int mid = (l+r)/2;
            if(temp[mid] == target) return true;
            if(temp[mid] < target) l = mid+1;
            else r = mid-1;
        }
        return false;
    }
}
