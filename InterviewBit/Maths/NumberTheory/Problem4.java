package InterviewBit.Maths.NumberTheory;

// Sorted Rank Permutation
// https://www.interviewbit.com/problems/sorted-permutation-rank/

public class Problem4 {
    public int findRank(String A) {
        int n = A.length();
        long fact[] = new long[53];
        int[] a = new int[257];
        int mod = 1000003;

        fact[0] = 1;
        fact[1] = 1;
        for(int i = 2; i <= 52; i++){
            fact[i] = (fact[i-1]%mod)*(i%mod);
        }

        for(char c: A.toCharArray()){
            a[(int)c]++;
        }

        int ans = 0;

        for(int i = 0; i < n; i++){
            int smaller = 0;
            for(int j = 1; j <= 256; j++){
                if(j == A.charAt(i)) break;
                if(a[j] == 1) smaller++;
            }
            ans += ((smaller%mod)*(fact[n-1-i]%mod))%mod;
            a[A.charAt(i)] = 0;
        }

        return (ans+1)%mod;
    }
}
