package CodeForces.Div2A;

import java.util.*;

public class IWannaBeTheGuy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        int x[] = new int[p];
        for(int i = 0; i < x.length; i++) x[i] = sc.nextInt();
        int q = sc.nextInt();
        int y[] = new int[q];
        for(int i = 0; i < y.length; i++) y[i] = sc.nextInt();
        sc.close();

        Set<Integer> set = new HashSet<>();
        for(int i: x) set.add(i);
        for(int i: y) set.add(i);

        boolean flag = true;

        for(int i = 1; i <= n; i++){
            if(set.contains(i)) continue;
            else{
                flag = false;
                break;
            }
        }
        if(flag) System.out.println("I become the guy.");
        else System.out.println("Oh, my keyboard!");
    }
}
