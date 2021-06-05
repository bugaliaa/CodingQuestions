package InterviewBit.Arrays.ValueRanges;

// https://www.interviewbit.com/problems/merge-overlapping-intervals/
// Merger Overlapping Intervals

import java.util.*;

public class Problem2 {
    class Interval{
        int start;
        int end;
        Interval(){start = 0; end = 0;}
        Interval(int s, int e){start = s; end = e;}
    }
    public ArrayList<Interval> merge(ArrayList<Interval> intervals) {
        ArrayList<Interval> list = new ArrayList<>()

        if(intervals == null || intervals.size() == 0) return intervals;
        Collections.sort(intervals, (a, b) -> a.start - b.start);
        
        int start = intervals.get(0).start;
        int end = intervals.get(0).end;

        for(Interval i: intervals){
            if(i.start <= end){
                end = Math.max(end, i.end);
            }else{
                list.add(new Interval(start, end));
                start = i.start;
                end = i.end;
            }
        }
        list.add(new Interval(start, end));
        return list;
    }
}
