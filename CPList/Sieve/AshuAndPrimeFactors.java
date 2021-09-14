package CPList.Sieve;

import java.util.Scanner;

// https://www.hackerearth.com/practice/math/number-theory/basic-number-theory-2/practice-problems/algorithm/ashu-and-prime-factors-4/

public class AshuAndPrimeFactors {

    static int N = (int)1e6;
    static boolean prime[] = new boolean[N+1];
    static int ans[] = new int[N+1];

    public static void sieve(){
        for(int i = 0; i <= N; i++) prime[i] = true;
        prime[0] = prime[1] = false;
        for(int i = 2; i*i <= N; i++){
            if(prime[i]){
                int c = 1;
                for(int j = i+i; j <= N; j += i){
                    if(prime[j] == true) c++;
                    prime[j] = false;
                }
                ans[i] = c;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sieve();

        while(t-- > 0){
            int x = sc.nextInt();
            System.out.println(ans[x]);
        }

        sc.close();
    }
}
