package CodeForces.Div2A;

import java.util.*;

public class ColorfulStones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String stones = sc.nextLine();
        String ins = sc.nextLine();
        sc.close();

        int j = 0;
        for(int i = 0; i < ins.length(); i++){
            if(stones.charAt(j) == ins.charAt(i)){
                j++;
            }
        }
        System.out.println(j+1);
    }
}
