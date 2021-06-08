package InterviewBit.Maths.NumberTheory;

// https://www.interviewbit.com/problems/find-nth-fibonacci/
// Find nth Fibonacci

public class Problem2 {
    long mod = 1000000007;
    public int solve(int n) {
        long F[][] = new long[][]{{1, 1}, {1, 0}};
        if(n == 0) return 0;
        power(F, n-1);
        return (int)F[0][0]%(int)mod;
    }
    public void power(long[][] F, int n){
        if(n == 0 || n == 1) return;
        long M[][] = new long[][]{{1, 1}, {1, 0}};

        power(F, n/2);
        multiply(F, F);

        if(n%2 != 0){
            multiply(F, M);
        }
    }
    public void multiply(long F[][], long M[][]){
        int x = (int)((F[0][0]%mod*M[0][0]%mod) + (F[0][1]%mod*M[1][0]%mod));
        int y = (int)((F[0][0]%mod*M[0][1]%mod) + (F[0][1]%mod*M[1][1]%mod));
        int z = (int)((F[1][0]%mod*M[0][0]%mod) + (F[1][1]%mod*M[1][0]%mod));
        int w = (int)((F[1][0]%mod*M[0][1]%mod) + (F[1][1]%mod*M[1][1]%mod));

        F[0][0] = x%mod;
        F[0][1] = y%mod;
        F[1][0] = z%mod;
        F[1][1] = w%mod;
    }
}
