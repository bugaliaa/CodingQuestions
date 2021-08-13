package CPList.SlidingWindow;

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

        long temp[] = new long[n+1];

        Stack<Integer> s = new Stack<>();
        int left[] = new int[n];
        int right[] = new int[n];

        for(int i = 0; i < n; i++){
            left[i] = -1;
            right[i] = n;
        }

        for(int i = n-1; i >= 0; i--){
            while(!s.empty() && arr[s.peek()] >= arr[i]) s.pop();
            if(!s.empty()){
                right[i] = s.peek();
            }
            s.push(i);
        }

        while(!s.empty()) s.pop();

        for(int i = 0; i < n; i++){
            while(!s.empty() && arr[s.peek()] >= arr[i]) s.pop();
            if(!s.empty()){
                left[i] = s.peek();
            }
            s.push(i);
        }

        for(int i = 0; i < n; i++){
            int len = right[i] - left[i] - 1;
            temp[len] = Math.max(temp[len], arr[i]);
        }

        for(int i = n-1; i >= 1; i--){
            temp[i] = Math.max(temp[i], temp[i+1]);
        }

        long ans[] = new long[n];
        for(int i = 1; i <= n; i++){
            ans[i-1] = temp[i];
        }

        return ans;
    }
}
