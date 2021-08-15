package CPList.SlidingWindow;

import java.util.Scanner;

public class BDGFT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            int c = 0;
            char[] s = sc.nextLine().toCharArray();
            int n = s.length;

            for(int i = 1; i*i+i <= n; i++){
                int c1 = 0;
                int j = 0;
                for(; j < i*i+i; j++){
                    if(s[j] == '1') c1++;

                }
                if(c1 == i) c++;
                for(; j < n; j++){
                    if(s[j - (i*i+i)] == '1') c1--;
                    if(s[j] == '1') c1++;
                    if(c1 == i) c++;
                }
            }
            System.out.println(c);
        }
        sc.close();
    }
}
