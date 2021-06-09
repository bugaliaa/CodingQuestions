package InterviewBit.Maths.Additional;

// https://www.interviewbit.com/problems/step-by-step/
// Step by Step

public class Problem1 {
    public int solve(int A) {
        if(A == 0) return 0;
        if(A < 0) A = -A;
        int i = 1;
        int sum = 0;
        while(true){
            sum += i;
            if(sum == A) return i;
            if(sum > A) break;
            i++;
        }
        int cur = sum - A;
        if(cur%2 == 0) return i;

        if((cur+i+1)%2 == 0) return i+1;

        return i+2;
    }
}
