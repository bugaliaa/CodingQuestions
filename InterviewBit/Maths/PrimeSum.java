package InterviewBit.Maths;

import java.util.*;

public class PrimeSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        sc.close();

        ArrayList<Integer> ans = primesum(A);

        for(int i : ans) System.out.println(i);
    }
    public static ArrayList<Integer> primesum(int A) {
        int i = 2;
        int j = A;
        ArrayList<Integer> list = new ArrayList<>();
        while(i <= j){
            if(isPrime(i) && isPrime(j)){
                if(i + j == A){
                    list.add(i);
                    list.add(j);
                    break;
                }
                if(i + j > A){
                    j--;
                }else{
                    i++;
                }
            }else if(isPrime(i)) j--;
            else if(isPrime(j)) i++;
            else{
                i++;
                j--;
            }
        }
        return list;
    }

    public static boolean isPrime(int X){
        if(X == 2) return true;
        if(X == 1 || X == 0) return false;
        
        int upperLimit = (int)Math.sqrt(X);
        for(int i = 2; i <= upperLimit; i++){
            if(i < X && X % i == 0) return false;
        }
        return true;
    }
}
