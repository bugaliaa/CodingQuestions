package SDE.Day8;

// https://practice.geeksforgeeks.org/problems/job-sequencing-problem-1587115620
// Job Sequencing (GFG)

import java.util.Arrays;

import SDE.Classes.Job;

public class Problem3 {
    
    public static int[] JobScheduling(Job arr[], int n){
        Arrays.sort(arr, (a, b) -> b.profit - a.profit);

        int maxDeadline = 0;
        for(int i = 0; i < n; i++){
            maxDeadline = Math.max(maxDeadline, arr[i].deadline);
        }

        int table[] = new int[maxDeadline+1];
        Arrays.fill(table, -1);
        int res[] = {0,0};

        for(int i = 0; i < n; i++){
            for(int j = arr[i].deadline; j > 0; j--){
                if(table[j] == -1){
                    res[1] += arr[i].profit;
                    res[0]++;
                    table[j] = i;
                    break;
                }
            }
        }

        return res;
    }
}
