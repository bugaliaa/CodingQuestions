package CPList.GreedyAlgorithms;

import java.util.*;

public class Problem1201 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        long sum = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
            sum += a[i];
            max = Math.max(max, a[i]);
        }
        sc.close();
        if(sum%2 == 0 && (sum-max) >= max) System.out.println("YES");
        else System.out.println("NO");
    }
}
