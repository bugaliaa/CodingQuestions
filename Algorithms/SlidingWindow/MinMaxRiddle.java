package Algorithms.SlidingWindow;

import java.util.*;

public class MinMaxRiddle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        long[] res = riddle(arr);
        for(int i = 0; i < n; i++) System.out.print(res[i] + " ");
        System.out.println();
    }

    public static long[] riddle(long[] arr) {
        int n = arr.length;
        long[] r = new long[n];
        for(int i = 1; i <= n; i++){
            List<Long> list = new LinkedList<>();
            long wMin = Integer.MAX_VALUE;
            long max = Integer.MIN_VALUE;
            for(int j = 0; j < i; j++){
                list.add(arr[j]);
                wMin = Math.min(wMin, arr[j]);
            }
            max = Math.max(max, wMin);
            for(int j = i; j < n; j++){
                list.remove(0);
                list.add(arr[j]);
                if(list.size() == 1){
                    wMin = arr[j];
                }else{
                    List<Long> temp = new LinkedList<>(list);
                    Collections.sort(temp);
                    wMin = temp.get(0);
                }
                max = Math.max(max, wMin);
            }
            r[i-1] = max;
        }
        return r;
    }
}
