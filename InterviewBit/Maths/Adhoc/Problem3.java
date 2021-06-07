package InterviewBit.Maths.Adhoc;

// https://www.interviewbit.com/problems/fizzbuzz/
// FizzBuzz

import java.util.*;

public class Problem3 {
    public ArrayList<String> fizzBuzz(int A) {
        ArrayList<String> list = new ArrayList<>();
        int c1 = 1;
        int c2 = 1;
        for(int i = 1; i <= A; i++){
            if(c1 == 3 && c2 == 5){
                list.add("FizzBuzz");
                c1 = 0;
                c2 = 0;
            }else if(c1 == 3){
                list.add("Fizz");
                c1 = 0;
            }else if(c1 == 5){
                list.add("Buzz");
                c2 = 0;
            }else{
                list.add(Integer.toString(i));
            }
            c1++;
            c2++;
        }
        return list;
    }
}
