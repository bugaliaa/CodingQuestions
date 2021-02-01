package InterviewBit.Maths;

import java.util.*;

public class FIzzBuzz {
    public static void main(String[] args) {
        
    }
    public ArrayList<String> fizzBuzz(int A) {
        int count3 = 1;
        int count5 = 1;
        ArrayList<String> list = new ArrayList<>();

        for(int i = 1; i <= A; i++){
            if(count3 == 3 && count5 == 5){
                list.add("FizzBuzz");
                count3 = 0;
                count5 = 0;
            }else if(count3 == 3){
                list.add("Fizz");
                count3 = 0;
            }else if(count5 == 5){
                list.add("Buzz");
                count5 = 0;
            }else{
                list.add(Integer.toString(i));
            }
            count3++;
            count5++;
        }

        return list;
    }
}
