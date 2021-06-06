package InterviewBit.Arrays.SimulationArray;

// https://www.interviewbit.com/problems/spiral-order-matrix-ii/
// Spiral Order Matrix II

import java.util.*;

public class Problem3 {
    public ArrayList<ArrayList<Integer>> generateMatrix(int A) {
        int l = 0, t = 0, r = A-1, b = A-1;
        int k = 1;
        int ptr = 1;
        int[][] a = new int[A][A];

        while(l <= r && t <= b){
            if(ptr == 1){
                for(int i = l; i <= r; i++){
                    a[t][i] = k++;
                }
                t++;
            }else if(ptr == 2){
                for(int i = t; i <= b; i++){
                    a[i][r] = k++;
                }
                r--;
            }else if(ptr == 3){
                for(int i = r; i >= l; i--){
                    a[b][i] = k++;
                }
                b--;
            }else{
                for(int i = b; i >= t; i--){
                    a[i][l] = k++;
                }
                l++;
            }
            ptr++;
            ptr = ptr%4;
        }
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for(int[] i: a){
            ArrayList<Integer> temp = new ArrayList<>();
            for(int j: i) temp.add(j);
            ans.add(temp);
        }
        return ans;
    }
}
