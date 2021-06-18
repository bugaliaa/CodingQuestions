package InterviewBit.Backtracking.MathsAndBacktracking;

// https://www.interviewbit.com/problems/maximal-string/
// Maximal String

public class Problem1 {
    private String s = "";
    public String solve(String A, int B) {
        char[] a = A.toCharArray();
        helper(a, B);
        return s;
    }
    public void helper(char[] a, int k){
        if(k == 0) return;
        int n = a.length;
        for(int i = 0; i < n-1; i++){
            for(int j = i+1; j < n; j++){
                if(a[j] > a[i]){
                    char temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;

                    String st = new String(a);

                    if(s.compareTo(st) < 0){
                        s = st;
                    }

                    helper(a, k-1);

                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
}
