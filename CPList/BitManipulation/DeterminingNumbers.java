package CPList.BitManipulation;

import java.util.*;

public class DeterminingNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++) a[i] = sc.nextInt();
        sc.close();

        int x = 0;
        for(int i: a) x ^= i;

        int pos = 0;
        int m = 1;

        while((x&m) == 0){
            m = m << 1;
            pos++;
        }

        int y1 = 0;
        int y2 = 0;

        for(int i: a){
            if((i & pos) == 1){
                y1 ^= i;
            }else{
                y2 ^= i;
            }
        }

        if(y1 < y2) System.out.println(y1 + " " + y2);
        else System.out.println(y2 + " " + y1);
        System.out.println();
    }
}
