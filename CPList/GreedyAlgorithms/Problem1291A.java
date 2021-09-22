package CPList.GreedyAlgorithms;

import java.util.Scanner;

public class Problem1291A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            sc.nextLine();
            char[] c = sc.nextLine().toCharArray();

            int odd = 0;
            for(int i = 0; i < n; i++){
                if(((c[i] - '0')&1) == 1) odd++;
            }
            if(odd <= 1){
                System.out.println("-1");
                continue;
            }
            int cnt = 0;
            for(char i: c){
                if(((i - '0')&1) == 1){
                    System.out.print(i);
                    cnt++;
                }
                if(cnt ==2) break;
            }
            System.out.println();
        }
        sc.close();
    }
}
