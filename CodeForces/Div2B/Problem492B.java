package CodeForces.Div2B;

import java.util.*;

public class Problem492B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++) a[i] = sc.nextInt();
        sc.close();

        Arrays.sort(a);

        int maxdist = Integer.MIN_VALUE;
        for(int i = 0; i < n-1; i++){
            maxdist = Math.max(maxdist, a[i+1]-a[i]);
        }

        double ans = (double)Math.max((double)maxdist/2, Math.max(a[0] - 0, l - a[n-1]));
        System.out.println(ans);
    }
}
