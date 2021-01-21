package CodeForces.Div2A;

import java.util.*;

public class Marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        char M[][] = new char[n][m];
        for(int i = 0; i < n; i++){
            M[i] = sc.nextLine().toCharArray();
        }
        sc.close();

        int ans = 0;

        for(int i = 0; i < n; i++){
            boolean wasBest = false;
            for(int j = 0; j < m; j++){
                boolean isBest = true;
                for(int k = 0; k < n; k++){
                    if(Character.getNumericValue(M[k][j]) > Character.getNumericValue(M[i][j])){
                        isBest = false;
                    }
                }
                if(isBest) wasBest = true;
            }
            if(wasBest) ans++;
        }
        System.out.println(ans);
    }
}
