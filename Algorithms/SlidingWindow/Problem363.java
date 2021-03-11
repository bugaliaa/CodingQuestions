package Algorithms.SlidingWindow;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Problem363 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++) a[i] = sc.nextInt();
        sc.close();
        Deque<Integer> dq = new LinkedList<>();
        int globalSum = 0;
        int sum = 0;
        int idx = 0;
        for(int i = 0; i < k; i++){
            dq.add(i);
            sum += a[i];
        }
        globalSum = sum;
        for(int i = k; i < n; i++){
            sum -= a[dq.peekFirst()];
            dq.removeFirst();
            dq.add(i);
            sum += a[i];
            if(sum < globalSum){
                idx = dq.peekFirst();
                globalSum = sum;
            }
        }
        System.out.println(idx+1 +  " ");
    }
}
