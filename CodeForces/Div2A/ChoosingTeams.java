package CodeForces.Div2A;

import java.util.Arrays;
import java.util.Scanner;

public class ChoosingTeams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] y = new int[n];
        for(int i = 0; i < n; i++) y[i] = sc.nextInt();
        sc.close();

        Arrays.sort(y);
        int teams = 0;
        for(int i = 0; i < n-2; i += 3){
            if(5-y[i+2] >= k) teams++;
            else break;
        }
        System.out.println(teams);
    }
}
