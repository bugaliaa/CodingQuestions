package InterviewBit.Arrays.SimulationArray;

// https://www.interviewbit.com/problems/pascal-triangle/
// Pascal Triangle

import java.util.*;

public class Problem4 {
    public ArrayList<ArrayList<Integer>> solve(int A) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for(int i = 0; i < A; i++) ans.add(new ArrayList<>());
        for(int i = 0; i < A; i++){
            for(int j = 0; j <= i; j++){
                if(j == 0 || j == i) ans.get(i).add(1);
                else ans.get(i).add(ans.get(i-1).get(j-1) + ans.get(i-1).get(j));
            }
        }
        return ans;
    }
}
