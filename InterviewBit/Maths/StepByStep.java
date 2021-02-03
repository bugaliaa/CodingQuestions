package InterviewBit.Maths;

public class StepByStep {
    public static void main(String[] args) {
        
    }
    public static int solve(int A) {
        if(A == 0) return 0;
        if(A < 0) A = A*(-1);
        int sum = 0;
        int i = 1;
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
