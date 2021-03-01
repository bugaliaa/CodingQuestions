package CodeChef.Feb21.Starters;

import java.util.Scanner;

public class COLGLF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int s = sc.nextInt();
            int a[] = new int[s];
            int globalTime = 0;
            for(int i = 0; i < s; i++){
                a[i] = sc.nextInt();
            }
            for(int i = 0; i < s; i++){
                int e = sc.nextInt();
                int localTime = sc.nextInt();
                for(int j = 1; j < e; j++){
                    int x = sc.nextInt();
                    localTime += x - a[i];
                }
                globalTime += localTime;
            }
            System.out.println(globalTime);
        }
        sc.close();
    }
}
