package CPList.SlidingWindow;

import java.util.*;

public class SHIVIGOD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            double[] ar = new double[n];
            int b = sc.nextInt();
            int a = sc.nextInt();
            double avg = 0.0;

            for(int i = 0; i < n; i++){
                ar[i] = sc.nextLong();
            }
            
            for(int i = a; i <= b; i++){
                double temp = 0;
                for(int j = 0; j < i; j++) temp += ar[j];

                avg = Math.max(avg, temp/i);
                for(int j = i; j < n; j++){
                    temp += ar[j];
                    temp -= ar[j-i];
                    avg = Math.max(avg, temp/i);
                }
            }
            System.out.println(avg);
        }
        sc.close();
    }
}
