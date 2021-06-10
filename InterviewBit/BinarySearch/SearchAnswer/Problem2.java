package InterviewBit.BinarySearch.SearchAnswer;

// https://www.interviewbit.com/problems/square-root-of-integer/
// Square Root of Integer

public  class Problem2 {
    public int sqrt(int A) {
        if(A == 0 || A == 1) return A;
        if(A == 2 || A == 3) return 1;
        long low = 1;
        long high = A/2;

        while(low <= high){
            long mid = low + (high - low)/2;
            if(mid == A/mid) return (int)mid;
            else if(mid < A/mid) low = mid;
            else high = mid;
        }
        return (int)low;
    }
}
