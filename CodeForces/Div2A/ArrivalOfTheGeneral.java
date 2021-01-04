package CodeForces.Div2A;

import java.util.Scanner;

public class ArrivalOfTheGeneral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        sc.close();

        int maxIndex = 0;
        int minIndex = 0;
        for(int i = 0; i < a.length; i++){
            if(a[i] > a[maxIndex]) maxIndex = i;
            if(a[i] < a[minIndex]) minIndex = i;
        }
    }
}