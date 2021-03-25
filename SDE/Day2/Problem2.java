package SDE.Day2;

// https://leetcode.com/problems/pascals-triangle/
// Pascal's Triangle

import java.util.*;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numRows = sc.nextInt();
        sc.close();
        List<List<Integer>> triangle = generate(numRows);
        for(List<Integer> i: triangle){
            for(int j: i){
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0; i < numRows; i++){
            ans.add(new ArrayList<>());
        }
        for(int i = 0; i < numRows; i++){
            for(int j = 0; j <= i; j++){
                if(j == 0 || j == i) ans.get(i).add(1);
                else{
                    ans.get(i).add(ans.get(i-1).get(j-1) + ans.get(i-1).get(j));
                }
            }
        }
        return ans;
    }
}
