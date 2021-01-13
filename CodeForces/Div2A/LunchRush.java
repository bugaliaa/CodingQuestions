package CodeForces.Div2A;

import java.util.Scanner;

public class LunchRush {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int a[][] = new int[n][2]; 
        for(int i = 0; i < n; i++){
            a[i][0] = sc.nextInt();
            a[i][1] = sc.nextInt();
        }
        sc.close();

        int maxJoy = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++){
            if(a[i][1] > k){
                maxJoy = Math.max(maxJoy, a[i][0] - a[i][1] + k);
            }else{
                maxJoy = Math.max(maxJoy, a[i][0]);
            }
        }
        System.out.println(maxJoy);
    }
}
