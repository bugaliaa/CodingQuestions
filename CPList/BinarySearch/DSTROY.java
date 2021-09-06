package CPList.BinarySearch;

import java.util.Scanner;

public class DSTROY {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        long a[] = new long[n];
        
        for(int i = 0; i < n; i++){
            a[i] = sc.nextLong();
        }
        sc.close();
        long l = 0;
        long r = (long)1e18;
        long m = 0;
        while(l+1 < r){
            m = l + r;
            m = m/2;
            long s = 0;

            for(int i = 0; i < n; i++){
                if(a[i] > m){
                    s += m;
                }else s += a[i];
            }

            if((s/m) >= k){
                l = m;
            }else r = m;
        }

        System.out.println(l);
    }
}
