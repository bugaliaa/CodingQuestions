package InterviewBit.Maths.Combinatorics;

// https://www.interviewbit.com/problems/grid-unique-paths/
// Grid Unique Paths

public class Problem2 {
    public int uniquePaths(int A, int B) {
        int N = A + B - 2;
        int r = A - 1;
        double ans = 1;
        for(int i = 1; i <= r; i++){
            ans = ans*(N - r + i)/i; 
        }
        return (int)ans;
    }
}
