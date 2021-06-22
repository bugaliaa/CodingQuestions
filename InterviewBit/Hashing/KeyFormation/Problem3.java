package InterviewBit.Hashing.KeyFormation;

// https://www.interviewbit.com/problems/equal/
// Equal

import java.util.*;

public class Problem3 {
    public ArrayList<Integer> equal(ArrayList<Integer> A) {
        Map<Integer, int[]> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        int[] p = new int[2];

        int n = A.size();

        for(int i = 0; i < n-1; i++){
            for(int j = i+1; j < n; j++){
                int sumAB = A.get(i) + A.get(j);
                if(!map.containsKey(sumAB)){
                    p[0] = i;
                    p[1] = j;
                    map.put(sumAB, p);
                }else{
                    p = map.get(sumAB);

                    if(p[0] != i && p[0] != j && p[1] != i && p[1] != j){
                        ArrayList<Integer> temp = new ArrayList<>();
                        temp.add(p[0]);
                        temp.add(p[1]);
                        temp.add(i);
                        temp.add(j);

                        if(list.size() == 0) list = temp;
                        else{
                            for(int k = 0; i < list.size(); k++){
                                if(list.get(k) < temp.get(k)) break;
                                if(list.get(k) > temp.get(k)){
                                    for(int l = 0; i < 4; l++) list.set(l, temp.get(l));
                                    break;
                                }
                            }
                        }
                    }
                    
                }
            }
        }

        return list;
    }

}
