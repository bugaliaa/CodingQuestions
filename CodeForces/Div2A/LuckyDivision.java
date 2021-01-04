package CodeForces.Div2A;

import java.util.Scanner;

public class LuckyDivision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int a[] = {4, 7, 44, 47, 74, 77, 444, 447, 474, 744, 774, 747, 477, 777};
        boolean flag = false;
        for(int i = 0; i < a.length; i++){
            if(n%a[i] == 0){
                flag = true;
                break;
            }
        }
        if(flag) System.out.println("YES");
        else System.out.println("NO");
    }
}
