package CodeForces.Div2A;

import java.util.Scanner;

public class Games {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int teams[][] = new int[n][2];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < 2; j++){
                teams[i][j] = sc.nextInt();
            }
        }
        sc.close();
        
        int count = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(teams[j][1] == teams[i][0] && i != j) count++; 
            }
        }
        System.out.println(count);
    }
}
