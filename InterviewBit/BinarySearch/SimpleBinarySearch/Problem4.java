package InterviewBit.BinarySearch.SimpleBinarySearch;

// https://www.interviewbit.com/problems/search-for-a-range/
// Search For a Range

import java.util.*;

public class Problem4 {
    public ArrayList<Integer> searchRange(final List<Integer> A, int B) {
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(-1);
        ans.add(-1);

        int start = Collections.binarySearch(A, B);
        if(start < 0) return ans;

        while(start >= 0 && A.get(start) == B) start--;
        start++;
        int end = start;
        while(end < A.size() && A.get(end) == B) end++;
        end--;

        ans.set(0, start);
        ans.set(1, end);

        return ans;

    }
}
