package CPList.GreedyAlgorithms;

import java.util.Scanner;

public class Problem1285B {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        
        int t = sc.nextInt();
        while(t-- > 0){
            if(solve()) System.out.println("YES");
            else System.out.println("NO");
        }
        sc.close();
    }
    public static boolean solve(){
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++) a[i] = sc.nextInt();

        long sum = 0;
        for(int i = 0; i < n; i++){
            sum += a[i];
            if(sum <= 0) return false;
        }
        sum = 0;
        for(int i = n-1; i >= 0; i--){
            sum += a[i];
            if(sum <= 0) return false;
        }

        return true;
    }
}
