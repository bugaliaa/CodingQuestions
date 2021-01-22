package CodeForces.Div2A;

import java.util.Scanner;

public class Cifera {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int l = sc.nextInt();
        sc.close();
        int ans = -1;

        while(l % k == 0){
            l /= k;
            ans++;
        }
        if(ans >= 0 && l == 1){
            System.out.println("YES\n" + ans);
        }else{
            System.out.println("NO");
        }
    }
}
