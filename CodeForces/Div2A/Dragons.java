package CodeForces.Div2A;

import java.util.Scanner;

public class Dragons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int n = sc.nextInt();
        int[][] xy = new int[n][2];

        for(int i = 0; i < n; i++){
            xy[i][0] = sc.nextInt();
            xy[i][1] = sc.nextInt();
        }
        sc.close();

        for(int i = 0; i < n - 1; i++){
            for(int j = 0; j < n - i - 1; j++){
                if(xy[j][0] > xy[j+1][0]){
                    int temp[] = xy[j];
                    xy[j] = xy[j+1];
                    xy[j+1] = temp;
                }
            }
        }
        
        boolean flag = true;
        for(int i = 0; i < n; i++){
            if(s <= xy[i][0]){
                flag = false;
                break;
            }else{
                s += xy[i][1];
            }
        }
        
        if(flag) System.out.println("YES");
        else System.out.println("NO");
    }
}
