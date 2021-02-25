package CodeForces.Div2B;

import java.util.Arrays;
import java.util.Scanner;

public class Problem362B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] d = new int[m];
        
        for(int i = 0; i < m; i++) d[i] = sc.nextInt();
        sc.close();
        if(m == 0){
            System.out.println("YES");
            return;
        }
        Arrays.sort(d);
        
        if(d[0] == 1 || d[m-1] == n){
            System.out.println("NO");
        }else{
            if(m == 1 || m == 2) System.out.println("YES");
            else{
                
                int i = 0;
                int j = i+1;
                int k = j+1;
                
                while(i < m-2){
                    if(d[j] == d[i] + 1 && d[k] == d[j] + 1){
                        System.out.println("NO");
                        return;
                    }
                    i++;
                    j++;
                    k++;
                }
                System.out.println("YES");
            }
        }
    }
}