package CPList.PrefixSum;

import java.util.Scanner;

public class COWA19B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a1[] = new int[1000002];
        int a2[] = new int[1000002];
        int q = sc.nextInt();
        while(q-- > 0){
            int l = sc.nextInt();
            int r = sc.nextInt();
            a1[l] += 1;
            a1[r+1] -= 1;
            a2[r+1] -= (r-l+1); 
        }
        for(int i = 1; i <= n; i++) a1[i] += a1[i-1];
        for(int i = 1; i <= n; i++) a2[i] += a2[i-1] + a1[i];

        int m = sc.nextInt();
        while(m-- > 0){
            int k = sc.nextInt();
            System.out.println(a2[k]);
        }
        sc.close();
    }
}
