package CPList.Sieve;

import java.util.Scanner;

// https://codeforces.com/contest/776/problem/B

public class Problem776B {

    static int N = (int)1e6;
    static boolean prime[] = new boolean[N+1];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        
        for(int i = 0; i <= N; i++){
            prime[i] = true;
        }
        prime[0] = prime[1] = false;
        for(int i = 2; i*i <= N; i++){
            if(prime[i]){
                for(int j = i+i; j <= N; j += i){
                    prime[j] = false;
                }
            }
        }

        if(n > 2) System.out.println(2);
        else System.out.println(1);

        for(int i = 2; i <= n+1; i++){
            if(prime[i]){
                System.out.print("1 ");
            }else{
                System.out.print("2 ");
            }
        }
    }
}
