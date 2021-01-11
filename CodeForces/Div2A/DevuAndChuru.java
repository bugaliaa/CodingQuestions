package CodeForces.Div2A;

import java.util.Scanner;

public class DevuAndChuru {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int timeDevu = 0;
        int t[] = new int[n];
        int ans = 0;
        for(int i = 0; i < n; i++){
            t[i] = sc.nextInt();
            timeDevu += t[i] + 10;
            ans += 2;
        }
        sc.close();
        ans = ans - 2;
        timeDevu = timeDevu-10;
        if(timeDevu > d){
            System.out.println(-1);
        }else{
            int timeLeft = d - timeDevu;
            System.out.println(timeLeft/5 + ans);
        }
    }
}
