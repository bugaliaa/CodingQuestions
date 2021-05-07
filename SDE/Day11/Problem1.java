package SDE.Day11;

// https://practice.geeksforgeeks.org/problems/find-nth-root-of-m5843/1#
// Find Nth Root by Binary Search (GFG)

public class Problem1 {
    public static void main(String[] args) {
        System.out.println(NthRoot(6, 4096));
    }
    public static int NthRoot(int n, int m){
        float low = 1;
        float high = m;
        float eps = 0.1f;
        float guess = (low + high)/2;
        while(Math.abs((Math.pow(guess, n))-m) >= eps){
            if(Math.pow(guess, n) > m){
                high = guess;
            }else low = guess;
            guess = (low + high)/2;
        }
        if(Math.floor(guess) == guess) return (int)guess;
        else return -1;
    }
}
