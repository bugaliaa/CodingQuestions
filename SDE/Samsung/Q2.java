package SDE.Samsung;

import java.util.*;

public class Q2 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 1, 3};
        System.out.println(func(arr, 3));
    }
    public static int func(int arr[], int k){
        Map<Integer, Integer> map = new HashMap<>();

        int ans = 0;
        int distinct = 0;
        for(int i = 0; i < arr.length; i++){
            if(i >= k){
                map.put(arr[i-k], map.getOrDefault(arr[i-k], 0) - 1);
                if(map.get(arr[i-k]) == 0) ans--;
            }
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            if(map.get(arr[i]) == 1) ans++;
            if(i >= k - 1) distinct += ans;
        }
        return distinct;
    }
}
