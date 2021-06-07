package InterviewBit.Maths.Adhoc;

// https://www.interviewbit.com/problems/prime-sum/
// Prime Sum

import java.util.*;

public class Problem1 {
    public ArrayList<Integer> primesum(int A) {
        int i = 2;
        int j = A;
        ArrayList<Integer> list = new ArrayList<>();
        while(i <= j){
            if(isPrime(i) && isPrime(j)){
                if(i + j == A){
                    list.add(i);
                    list.add(j);
                    return list;
                }else if(i + j > A) j--;
                else i++;
            }else if(isPrime(i)) j--;
            else if(isPrime(j)) i++;
            else{
                i++;
                j--;
            }
        }
        return list;
    }
    public boolean isPrime(int X){
        if(X == 2) return true;
        if(X == 1 || X == 0) return false;
        int upper = (int)Math.sqrt(X);
        for(int i = 2; i <= upper; i++){
            if(X%i == 0) return false;
        }
        return true;
    }
}
