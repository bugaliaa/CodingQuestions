package SDE.Day1;

// https://www.geeksforgeeks.org/efficiently-merging-two-sorted-arrays-with-o1-extra-space/
// Efficiently merge two sorted arrays with O(1) extra space

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int a1[] = new int[n1];
        for(int i = 0; i < n1; i++) a1[i] = sc.nextInt();

        int n2 = sc.nextInt();
        int a2[] = new int[n2];
        for(int i = 0; i < n2; i++) a2[i] = sc.nextInt();
        sc.close();
        mergeArrays(a1, a2, n1, n2);
        for(int i = 0; i < n1; i++) System.out.print(a1[i] + " ");
        for(int i = 0; i < n2; i++) System.out.print(a2[i] + " ");
        System.out.println();
    }

    public static int nextGap(int gap){
        if(gap <= 1) return 0;
        return (gap/2)+(gap%2);
    }

    public static void mergeArrays(int[] a1, int[] a2, int n1, int n2){
        int i, j, gap = n1 + n2;
        for(gap = nextGap(gap); gap > 0; gap = nextGap(gap)){
            for(i = 0; i+gap < n1; i++){
                if(a1[i] > a1[i+gap]){
                    int temp = a1[i];
                    a1[i] = a1[i+gap];
                    a1[i+gap] = temp;
                }
            }
            for(j = gap > n1 ? gap - n1 : 0; i < n1 && j < n2; i++, j++){
                if(a1[i] > a2[j]){
                    int temp = a1[i];
                    a1[i] = a2[j];
                    a2[j] = temp;
                }
            }
            if(j < n2){
                for(j = 0; j+gap < n2; j++){
                    if(a2[j] > a2[j+gap]){
                        int temp = a2[j];
                        a2[j] = a2[j+gap];
                        a2[j+gap] = temp;
                    }
                }
            }
        }
    }
}
