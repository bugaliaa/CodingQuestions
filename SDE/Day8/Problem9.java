package SDE.Day8;

import java.util.Arrays;
import java.util.Comparator;

import SDE.Classes.Item;

// https://practice.geeksforgeeks.org/problems/fractional-knapsack-1587115620/1
// Fractional Knapsack (GFG)

class itemComparator implements Comparator<Item>{
    @Override
    public int compare(Item a, Item b){
        double r1 = (double)(a.value) / (double)(a.weight);
        double r2 = (double)(b.value) / (double)(b.weight);
        if(r1 < r2) return 1;
        else if(r1 > r2) return -1;
        else return 0;
    }
}

public class Problem9 {
    double fractionalKnapsack(int W, Item arr[], int n){
        Arrays.sort(arr, new itemComparator());

        double ans = 0;
        int currWeight = 0;

        for(int i = 0; i < n; i++){
            if(currWeight + arr[i].weight <= W){
                ans += arr[i].value;
                currWeight += arr[i].weight;
            }else{
                int remain = W - currWeight;
                ans += ((double)arr[i].value / (double)arr[i].weight) * (double)remain;
                break;
            }
        }

        return ans;
    }
}
