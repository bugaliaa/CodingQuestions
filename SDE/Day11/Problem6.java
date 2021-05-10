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
        int a[] = new int[n+m];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i < n && j < m){
            if(arr1[i] <= arr2[j]){
                a[k] = arr1[i];
                i++;
            }else{
                a[k] = arr2[j];
                j++;
            }
            k++;
        }
        while(i < n){
            a[k] = arr1[i];
            k++;
            i++;
        }
        while(j < m){
            a[k] = arr2[j];
            k++;
            j++;
        }
        return a[K-1];
    }
}
