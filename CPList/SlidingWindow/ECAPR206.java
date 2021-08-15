package CPList.SlidingWindow;

import java.util.Scanner;

public class ECAPR206 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int a[] = new int[n];
            long max = 0;
            long sum = 0;
            
            for(int i = 0; i < n; i++){ 
                a[i] = sc.nextInt();
            }
            for(int i = 0; i < k; i++){
                sum += a[i];
            }
            max = sum;
            for(int i = 1; i < n; i++){
                sum -= a[i-1];
                sum += a[(i+k-1)%n];
                max = Math.max(max, sum);
            }
            System.out.println(max);
        }
        sc.close();
    }
}
