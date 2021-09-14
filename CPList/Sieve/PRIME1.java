package CPList.Sieve;

import java.io.*;
import java.util.*;

public class PRIME1 {
    
    static int N = 100000;
    static boolean si[] = new boolean[N+1];

    public static void sieve(){
        si[0] = true;
        si[1] = true;
        for(int i = 2; i*i <= N; i++){
            if(si[i] == true){
                for(int j = i*i; j <= N; j++){
                    si[j] = false;
                }
            }
        }
    }

    public static List<Integer> generate(int n){
        List<Integer> list = new ArrayList<>();
        for(int i = 2; i <= n; i++){
            if(si[i] == true){
                list.add(i);
            }
        }
        return list;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        sieve();

        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){           

            String s[] = br.readLine().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            List<Integer> list = generate((int)Math.sqrt(n));
            int d[] = new int[n-m+1];
            for(int i = 0; i < n-m+1; i++){
                d[i] = 1;
            }

            for(int i: list){
                int first = (m/i)*i;
                if(first < m) first += i;
                for(int j = Math.max(i*i, first); j <= n; j += i){
                    d[j-m] = 0;
                }
            }

            for(int i = m; i <= n; i++){
                if(d[i-m] == 1) System.out.println(i);
            }

            System.out.println();
        }
        br.close();
    }
}
