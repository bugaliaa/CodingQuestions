package CodeForces.Div2A;

import java.util.*;

public class RomaAndLuckyNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.nextLine();
        String in[] = new String[n];
        in = sc.nextLine().split(" ");
        sc.close();

        int count = 0;
        for(String s: in){
            if(isLucky(s) <= k) count++;
        }
        System.out.println(count);
    }

    public static int isLucky(String s){
        int t = 0;
        for(char c: s.toCharArray()){
            if(c != '7' && c != '4') return 0;
            else t++;
        }
        return t;
    }
}
