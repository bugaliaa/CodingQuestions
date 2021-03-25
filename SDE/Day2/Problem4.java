package SDE.Day2;

public class Problem4 {
    public static void main(String[] args) {
        int a[] = {5, 4, 3, 2, 1};
        int n = a.length;
        int temp[] = new int[n];
        int ans = mergeSort(a, temp, 0, n-1);
        System.out.println(ans);
    }

    public static int mergeSort(int[] a, int[] temp, int left, int right){
        int mid = 0; int count = 0;
        if(left < right){
            mid = (left+right)/2;
            count += mergeSort(a, temp, left, mid);
            count += mergeSort(a, temp, mid+1, right);
            count += merge(a, temp, mid+1, left, right);
        }
        return count;
    }

    public static int merge(int[] a, int[] temp, int mid, int left, int right){
        int i = left;
        int j = mid;
        int k = left;
        int count = 0;
        while((i <= mid-1) && (j <= right)){
            if(a[i] <= a[j]) temp[k++] = a[i++];
            else{
                temp[k++] = a[j++];
                count = count + (mid-1);
            }
        }
        while(i <= mid-1){
            temp[k++] = a[i++];
        }
        while(j <= right){
            temp[k++] = a[j++];
        }
        for(i = left; i <= right; i++){
            a[i] = temp[i];
        }

        return count;
    }
}
