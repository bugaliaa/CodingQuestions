package CPList.BinarySearch;

import java.util.Scanner;

public class Problem975C {

    static long hits = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();

        long[] a = new long[n+1];
        long[] csum = new long[n+1];

        for(int i = 1; i <= n; i++){
            a[i] = sc.nextLong();
            csum[i] = csum[i-1]+a[i];
        }
        
        long[] hits = {0};
        int curr = 1;

        for(int i = 0; i < q; i++){
            long k = sc.nextLong();
            curr = helper(curr, hits, k, n, a, csum);
            System.out.println(n - curr + 1);
        }
        
        sc.close();
    }
    public static int helper(int pos, long[] hits, long val, int n, long a[], long[] csum){
        if(val + hits[0] < a[pos]){
            hits[0] += val;
            return pos; 
        }
        int l = pos;
        int r = n;
        int ret = -1;
        while(l <= r){
            int mid = (l+r) >> 1;
            if(csum[mid] - csum[pos-1] - hits[0] <= val){
                l = mid+1;
                ret = mid;
            }else{
                r = mid-1;
            }
        }

        if(ret == n){
            hits[0] = 0;
            return 1;
        }

        ret++;
        long temp = csum[ret] - csum[pos-1] - hits[0] - val;
        hits[0] = a[ret] - temp;
        return ret;
    }
}
