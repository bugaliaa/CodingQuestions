package SDE.Day24;

// https://practice.geeksforgeeks.org/problems/shortest-path-from-1-to-n0156/1
// Shortest Path from 1 to n 

public class Problem2 {
    static int minStep(int n){
        int ans = 0;
        for(int i = n; i >= 1; ){
            if(i%3 == 0){
                i = i/3;
            }else{
                i--;
            }
            ans++;
        }
        return ans-1;
    }
}
