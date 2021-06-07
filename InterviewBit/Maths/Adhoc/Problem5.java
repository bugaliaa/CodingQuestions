package InterviewBit.Maths.Adhoc;

// https://www.interviewbit.com/problems/power-of-two-integers/
// Power of Two Numbers

public class Problem5 {
    public int isPower(int A) {
        if(A == 1) return 1;

        for(int i = 2; i*i <= A; i++){
            double val = Math.log(A)/Math.log(i);
            if((val - (int)val) < 0.00000001) return 1;
        }

        return 0;
    }
}
