package CPList.BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class Problem812C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long s = sc.nextLong();

        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        sc.close();
        
        int l = 0;
        int r = n+1;


        while(l < r-1){
            int mid = (l + r) >> 1;
            if(check(a, n, mid) <= s){
                l = mid;
            }else{
                r = mid;
            }
        }

        System.out.println(l + " " + check(a, n, l));
    }

    public static long check(int[] a, int n, int k){
        long[] b = new long[n];
        for(int i = 0; i < n; i++){
            b[i] = a[i] + (i+1)*(long)k;
        }
        Arrays.sort(b);
        long ans = 0;

        for(int i = 0; i < k; i++){
            ans += b[i];
        }

        return ans;
    }
}
