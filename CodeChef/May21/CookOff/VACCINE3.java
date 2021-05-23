package CodeChef.May21.CookOff;

import java.util.Scanner;

public class VACCINE3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int G = sc.nextInt();
            int P = sc.nextInt();
            int[] X = new int[11];
            int minDays = 0;
            int maxDays = 0;
            for(int i = 1; i < 11; i++){
                X[i] = sc.nextInt();
            }
            for(int i = 10; i >= 1; i--){
                int temp = P;
                while(X[i] < temp && G != i){
                    temp -= X[i];
                    i--;
                }
                if(i == G) break;
            }
            System.out.println(minDays + " " + maxDays);
        }
        sc.close();
    }
}
