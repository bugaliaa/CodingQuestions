package CPList.Sieve;

import java.util.*;

public class SpecialNumbers {
    static int N = (int)1e7;
    static boolean prime[] = new boolean[N+1];
    static boolean isSpecial[] = new boolean[N+1];
    static List<Integer> list = new ArrayList<>();

    public static void sieve(){
        for(int i = 0; i <= N; i++) prime[i] = true;
        prime[0] = prime[1] = false;
        for(int i = 2; i*i <= N; i++){
            for(int j = i+i; j <= N; j += i){
                if(prime[j]){
                    prime[j] = false;
                }
            }
        }

        for(int i = 0; i <= N; i++){
            if(prime[i]) list.add(i);
        }
    }
    public static void main(String[] args) {
        sieve();
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            if(isSpecial[n]){
                System.out.println("YES");
                continue;
            }

            int i = 0;
            int k = 0;

            while(i < list.size() && list.get(i) <= n){
                if(n%list.get(i) == 0) k++;
                i++; 
            }
            if(k >= p){
                isSpecial[n] = true;
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
