package SDE.Day11;

// https://practice.geeksforgeeks.org/problems/k-th-element-of-two-sorted-array1317
// Kth element of two sorted arrays (GFG)

public class Problem6 {
    public static void main(String[] args) {
        int arr1[] = {2, 3, 6, 7, 9};
        int arr2[] = {1, 4, 8, 10};
        System.out.println(kthElement(arr1, arr2, arr1.length, arr2.length, 5));
    }
    public static long kthElement( int arr1[], int arr2[], int n, int m, int K){
        int k = 0;
        int i = 0;
        int j = 0;
        while(i < n && j < m){
            if(arr1[i] < arr2[j]){
                k++;
                if(k == K) return arr1[i];
                i++;
            }else{
                k++;
                if(k == K) return arr2[j];
                j++;
            }
        }

        while(i < n){
            k++;
            if(k == K) return arr1[i];
            i++;
        }

        while(j < m){
            k++;
            if(k == K) return arr2[j];
            j++;
        }

        return -1;
    }
}
