package CPList.SwappingTerms;

import java.util.Scanner;

public class Problem920C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++) a[i] = sc.nextInt();
        sc.nextLine();
        char c[] = sc.nextLine().toCharArray();
        sc.close();

        int max = 0;
        for(int i = 0; i < n; i++){
            max = Math.max(max, a[i]);
            if(max > i+1 && c[i] == '0'){
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
