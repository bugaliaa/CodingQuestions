package Algorithms.SlidingWindow;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class BDGFT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            char[] s = sc.nextLine().toCharArray();
            int ans = 0;
            int count_z = 0;
            int count_o = 0;
            Deque<Character> dq = new LinkedList<>();            
            for(int i = 1; ((i*i) + i) <= s.length; i++){
                for(int j = i; j <= ((i*i) + i); j++){
                    dq.add(s[j-1]);
                    if(s[j-1] == '0') count_z++;
                    else count_o++;
                }
                if(count_o*count_o == count_z) ans++;
                for(int j = i; j <= ((i*i) + i); j++){
                    if(dq.getFirst() == '0') count_z--;
                    else count_o--;
                    dq.removeFirst();
                    dq.add(s[j-1]);
                    if(s[j-1] == '0') count_z++;
                    else count_o++;
                    if(count_o*count_o == count_z) ans++;
                }
            }
            System.out.println(ans);
        }
        sc.close();
    }
}
