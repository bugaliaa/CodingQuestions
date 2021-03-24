package SDE.Day1;

// https://leetcode.com/problems/merge-intervals/
// Merge Overlapping Intervals

import java.util.*;

public class Problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int intervals[][] = new int[n][2];
        for(int i = 0; i < n; i++){
            intervals[i][0] = sc.nextInt();
            intervals[i][1] = sc.nextInt();
        }
        sc.close();
        int res[][] = merge(intervals);
        for(int i = 0; i < res.length; i++){
            System.out.println(res[i][0] + " " + res[i][1]);
        }
    }
    public static int[][] merge(int[][] intervals) {
        List<int[]> list = new ArrayList<>();

        if(intervals.length == 0 || intervals == null) return list.toArray(new int[0][]);

        Arrays.sort(intervals, (a,b) -> a[0] - b[0]);

        int start = intervals[0][0];
        int end = intervals[0][1];
        for(int[] i: intervals){
            if(i[0] <= end){
                end = Math.max(i[1], end);
            }else{
                list.add(new int[]{start, end});
                start = i[0];
                end = i[1];
            }
        }
        list.add(new int[]{start, end});
        return list.toArray(new int[0][]);
    }
}
