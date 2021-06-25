package InterviewBit.HeapsAndMaps.Heap;

// https://www.interviewbit.com/problems/maximum-sum-combinations/
// Maximum Sum Combinations

import java.util.*;

public class Problem6 {
    class Pair{
        int l;
        int m;

        Pair(int l, int m){this.l = l; this.m = m;}

        @Override public boolean equals(Object o){
            if(o == null) return false;
            
            if(!(o instanceof Pair)) return false;

            Pair obj = (Pair)o;
            
            return (l == obj.l && m == obj.m);
        }

        @Override public int hashCode(){
            return Objects.hash(l, m);
        }
    }
    class PairSum implements Comparable<PairSum>{
        int sum;
        int l;
        int m;

        public PairSum(int sum, int l, int m){this.sum = sum; this.l = l; this.m = m;}

        @Override public int compareTo(PairSum o){
            return Integer.compare(o.sum, sum);
        }
    }
    public ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B, int C) {
        Collections.sort(A);
        Collections.sort(B);

        PriorityQueue<PairSum> pq = new PriorityQueue<>();
        Set<Pair> pairs = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();

        int l = A.size()-1;
        int m = A.size()-1;

        pairs.add(new Pair(l, m));
        pq.add(new PairSum(A.get(l) + B.get(m), l, m));

        for(int i = 0; i < C; i++){
            PairSum sum = pq.poll();
            list.add(sum.sum);
            l = sum.l-1;
            m = sum.m;

            if(l >= 0 && m >= 0 && !pairs.contains(new Pair(l, m))){
                pairs.add(new Pair(l, m));
                pq.add(new PairSum(A.get(l) + B.get(m), l, m));
            }

            l = sum.l;
            m = sum.m-1;

            if(l >= 0 && m >= 0 && !pairs.contains(new Pair(l, m))){
                pairs.add(new Pair(l, m));
                pq.add(new PairSum(A.get(l) + B.get(m), l, m));
            }
        }

        return list;
    }
}
