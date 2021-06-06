package InterviewBit.Arrays.SimulationArray;

// https://www.interviewbit.com/problems/anti-diagonals/
// Anti Diagonals

import java.util.*;

public class Problem5 {
    public ArrayList<ArrayList<Integer>> diagonal(ArrayList<ArrayList<Integer>> A) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        int n = A.size();
        
        for(int g = 0; g < n; g++){
            ans.add(new ArrayList<>());
            for(int i = 0, j = g; j >= 0 && i < n; i++, j--){
                ans.get(g).add(A.get(i).get(j));
            }
        }

        for(int g = 1; g < n; g++){
            ans.add(new ArrayList<>());
            for(int i = g, j = n-1; i < n && j >= 0; i++, j--){
                ans.get(g+(n-1)).add(A.get(i).get(j));
            }
        }

        return ans;
    }
}
