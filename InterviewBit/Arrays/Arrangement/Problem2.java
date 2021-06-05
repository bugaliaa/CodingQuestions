package InterviewBit.Arrays.Arrangement;

// https://www.interviewbit.com/problems/rotate-matrix/
// Rotate Matrix

import java.util.*;

public class Problem2 {
    public void rotate(ArrayList<ArrayList<Integer>> a) {
        int n = a.size();
        int ar[][] = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                ar[i][j] = a.get(i).get(j);
            }
        }
        transpose(ar, n);
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                a.get(i).set(j, ar[i][j]);
            }
        }
    }
    public void transpose(int[][] ar, int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                int temp = ar[i][j];
                ar[i][j] = ar[j][i];
                ar[j][i] = temp;
            }
        }
        reverse(ar, n);
    }
    public void reverse(int[][] ar, int n){
        for(int i = 0; i < n; i++){
            int l = 0;
            int r = n-1;
            while(l <= r){
                int temp = ar[i][l];
                ar[i][l] = ar[i][r];
                ar[i][r] = temp;
                l++;
                r--;
            }
        }
    }
}
