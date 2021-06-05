package InterviewBit.Arrays.Arrangement;

// https://www.interviewbit.com/problems/merge-intervals/
// Merge Intervals

import java.util.*;

public class Problem5 {
    class Interval{
        int start;
        int end;
        Interval(){start = 0; end = 0;}
        Interval(int s, int e){start = s; end = e;}
    }
    public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
        
        if(intervals == null || intervals.size() == 0){
            intervals = new ArrayList<>();
            intervals.add(newInterval);
            return intervals;
        }

        int i = 0;
        while(i < intervals.size()){
            if(intervals.get(i).end < newInterval.start){
                i++;
            }else if(intervals.get(i).start > newInterval.end){
                intervals.add(i, newInterval);
                break;
            }else{
                newInterval.start = Math.min(newInterval.start, intervals.get(i).start);
                newInterval.end = Math.max(newInterval.end, intervals.get(i).end);
                intervals.remove(i);
            }
        }
        if(i == intervals.size()) intervals.add(newInterval);
        return intervals;
    }
}
