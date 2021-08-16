package CPList.SlidingWindow;

// https://www.codechef.com/problems/SUMPOWER
// SUMPOWER (CodeChef)

import java.util.*;

public class SUMPOWER {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            sc.nextLine();
            char[] c = sc.nextLine().toCharArray();

            long ans = 0;
            long sum = 0;
            for(int i = 0; i < k; i++){
                sum += (long)(c[i] != c[i+1] ? 1 : 0);
            }
            for(int i = 0; i < n-k; i++){
                ans += sum;
                if(i+k+1 == n) continue;
                sum -= (long)(c[i] != c[i+1] ? 1 : 0);
                sum += (long)(c[i+k] != c[i+k+1] ? 1 : 0); 
            }

            System.out.println(ans);
        }
        sc.close();
    }
}
