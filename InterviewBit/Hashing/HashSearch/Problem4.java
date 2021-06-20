package InterviewBit.Hashing.HashSearch;

// https://www.interviewbit.com/problems/4-sum/
// 4 Sum

import java.util.*;

public class Problem4 {
    public ArrayList<ArrayList<Integer>> fourSum(ArrayList<Integer> A, int B) {
        Collections.sort(A);

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        int n = A.size();
        for(int i = 0; i < n-3; i++){
            for(int j = i+1; j < n-2; j++){
                int t = B - A.get(i) - A.get(j);
                int l = j+1;
                int r = n-1;
                while(l < r){
                    int sum = A.get(l) + A.get(r);
                    if(sum == t){
                        ArrayList<Integer> temp = new ArrayList<>();
                        temp.add(A.get(i));
                        temp.add(A.get(j));
                        temp.add(A.get(l));
                        temp.add(A.get(r));
                        list.add(temp);

                        while(l < r && A.get(l) == temp.get(2)) l++;
                        while(l < r && A.get(r) == temp.get(3)) r--;

                    }else if(sum < t) l++;
                    else r--;
                }
                while(j+1 < n && A.get(j) == A.get(j+1)) j++;
            }
            while(i+1 < n && A.get(i) == A.get(i+1)) i++;
        }

        return list;
    }
}
