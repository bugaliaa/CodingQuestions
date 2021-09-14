package CPList.Sieve;

import java.util.*;

public class TDPRIMES {

    static int N = (int)1e8;
    static boolean prime[] = new boolean[N+1];
    public static void main(String[] args) {
        for(int i = 0; i <= N; i++) prime[i] = true;
        prime[0] = prime[1] = false;
        for(int i = 2; i*i <= N; i++){
            if(prime[i]){
                for(int j = i*i; j <= N; j += i){
                    prime[i] = false;
                }
            }
        }

        List<Integer> list = new ArrayList<>();

        for(int i = 2; i <= N; i++){
            if(prime[i]) list.add(i);
        }

        for(int i = 1; i < list.size(); i += 100){
            System.out.println(list.get(i-1));
        }
    }
}
