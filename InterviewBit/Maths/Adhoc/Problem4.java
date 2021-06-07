package InterviewBit.Maths.Adhoc;

// https://www.interviewbit.com/problems/is-rectangle/
// Is Rectangle

public class Problem4 {
    public int solve(int A, int B, int C, int D) {
        if((A == B && A != C && A != D) || (A == C && A != B && A != D) || (A == D && A != B && A != C)){
            if((C == D && C != A && C != B) || (C == A && C != B && C != B) || (C == B && C != A && C != D)) return 1;
            else return 0;
        }
        else return 0;
    }
}
