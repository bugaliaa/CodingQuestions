package CodeForces.Div2A;

import java.util.Scanner;

public class Cakeminator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        String s;
        sc.nextLine();
        int[] row = new int[11];
        int[] col = new int[11];
        for(int i = 0; i < r; i++){
            s = sc.nextLine();
            for(int j = 0; j < c; j++){
                if(s.charAt(j) == 'S'){
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }
        sc.close();

        int cakes = 0;

        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                if(row[i] == 0 || col[j] == 0) cakes++;
            }
        }
        System.out.println(cakes);
    }
}
