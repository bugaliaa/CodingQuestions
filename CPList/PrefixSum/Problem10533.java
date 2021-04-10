package CPList.PrefixSum;

import java.util.Arrays;
import java.util.Scanner;

// https://onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&category=24&page=show_problem&problem=1474

public class Problem10533 {
    static long max = 1000000;
    static boolean[] prime = new boolean[1000001];
    static int[] dprimes = new int[1000001];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sieve();
        while(t-- > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(dprimes[b] - dprimes[a-1]);
        }
        sc.close();
    }

    static void sieve(){
        Arrays.fill(prime, true);
        prime[0] = prime[1] = false;
        for(int i = 2; i <= 1000001; i++){
            dprimes[i] = dprimes[i-1];
            if(prime[i]){
                if(prime[digitSum(i)]) ++dprimes[i];
                for(int j = i*i; j <= 1000001; j += i) prime[j] = false;
            }
        }
    }

    static int digitSum(int x){
        int t = 0;
        while(x > 0){
            t += x%10;
            x /= 10;
        }
        return t;
    }
    
}
