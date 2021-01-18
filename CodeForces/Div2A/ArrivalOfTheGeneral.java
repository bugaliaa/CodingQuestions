package CodeForces.Div2A;

import java.util.Scanner;

public class ArrivalOfTheGeneral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int a[] = new int[n];
        int minValue = Integer.MAX_VALUE;
        int minIndex = 0;
        int maxValue = Integer.MIN_VALUE;
        int maxIndex = 0;
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
            if(a[i] > maxValue){
                maxIndex = i;
                maxValue = a[i];
            }
            if(a[i] <= minValue){
                minIndex = i;
                minValue = a[i];
            }
        }
        sc.close();

        if(maxIndex > minIndex) System.out.println((maxIndex-1) + (n-minIndex) - 1);
        else System.out.println((maxIndex-1) + (n-minIndex));
    }
}