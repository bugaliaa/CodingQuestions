package CodeForces.Div2A;

import java.util.Scanner;

public class BeautifulMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int idxi = 0, idxj = 0;;


        int a[][] = new int[5][5];
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                a[i][j] = sc.nextInt();
                if(a[i][j] == 1){
                    idxi = i;
                    idxj = j;
                }
            }
        }
        sc.close();

        int minCol = Math.abs(2 - idxi);
        int minRow = Math.abs(2 - idxj);

        System.out.println(minCol + minRow);
    }
}
