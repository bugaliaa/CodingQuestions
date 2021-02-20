package CodeForces.Div2B;

import java.util.Arrays;
import java.util.Scanner;

public class Problem447B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] c = sc.nextLine().toCharArray();
        int k = sc.nextInt();
        int[] a = new int[27];
        for(int i = 1; i < 27; i++) a[i] = sc.nextInt();
        sc.close();

        long ans = 0;
        int i = 0;
        for(i = 0; i < c.length; i++){
            ans += (i+1)*(a[(int)c[i] - 96]);
        }

        int[] t = a.clone();
        Arrays.sort(t);
        int j = t.length-1;
        while(k > 0){
            ans += (i+1)*(t[j]);
            k--;
            i++;
        }
        System.out.println(ans);
    }
}
