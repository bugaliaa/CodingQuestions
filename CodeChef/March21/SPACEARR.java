package CodeChef.March21;

import java.util.Arrays;
import java.util.Scanner;

public class SPACEARR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int a[] = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }
            Arrays.sort(a);
            long ans = 0;
            long temp = 0;
            for(int i = 0; i < n; i++){
                if(i+1<a[i]){
                    temp = 1;
                    break;
                }
                ans += i+1-a[i];
            }
            if(temp == 1){
                System.out.println("Second");
            }else{
                if(ans%2 == 0){
                    System.out.println("Second");
                }else{
                    System.out.println("First");
                }
            }
        }
        sc.close();
    }
}
