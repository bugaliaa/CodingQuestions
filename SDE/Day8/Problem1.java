package SDE.Day8;

// https://practice.geeksforgeeks.org/problems/n-meetings-in-one-room-1587115620
// N Meetings in One Room

import java.util.*;

public class Problem1 {
    public static void main(String[] args) {
        int start[] = {1,0,3,8,5,8};
        int end[] = {2,6,4,9,7,9};
        System.out.println(maxMeetings(start, end, start.length));
    }
    public static int maxMeetings(int start[], int end[], int n){
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            list.add(Arrays.asList(start[i], end[i], i+1));
        }
        Collections.sort(list, (List<Integer> l1, List<Integer> l2) -> l1.get(1) - l2.get(1));

        int count = 1;
        int endTime = list.get(0).get(1);
        for(int i = 1; i < list.size(); i++){
            if(list.get(i).get(0) > endTime){
                count++;
                endTime = list.get(i).get(1);
            }
        }

        return count;
    }
}
