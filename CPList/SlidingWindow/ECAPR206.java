package CPList.SlidingWindow;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class ECAPR206 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int a[] = new int[n];
            int max_sum = 0;
            int sum = 0;
            Deque<Integer> dq = new LinkedList<>();
            for(int i = 0; i < n; i++){ 
                a[i] = sc.nextInt();
            }
            for(int i = 0; i < k; i++){
                dq.add(a[i]);
                sum += a[i];
            }
            max_sum = sum;
            int i = k;
            while(i%n != k-1){
                sum -= dq.getFirst();
                dq.removeFirst();
                dq.add(a[i%n]);
                sum += a[i%n];
                max_sum = Math.max(max_sum, sum);
                i++;
            }
            System.out.println(max_sum);
        }
        sc.close();
    }
}
