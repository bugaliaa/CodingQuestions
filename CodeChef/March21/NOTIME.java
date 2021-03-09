package CodeChef.March21;

import java.util.Scanner;

public class NOTIME {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = sc.nextInt();
        int x = sc.nextInt();
        boolean flag = false;
        while(n-- > 0){
            int t = sc.nextInt();
            if(t+x >= h){
                flag = true;
                break;
            }
        }
        if(flag) System.out.println("YES");
        else System.out.println("NO");
        sc.close();
    }
}
