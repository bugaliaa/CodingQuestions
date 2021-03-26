package SDE.Day3;

//https://leetcode.com/problems/powx-n
// Pow(x, n)

public class Problem3 {
    public static void main(String[] args) {
        System.out.println(myPow(2.00000, 10));
    }
    public static double myPow(double x, int n) {
        double ans = 1.0;
        long nn = n;
        if(nn < 0) nn = nn*(-1);
        while(nn > 0){
            if(nn%2 == 0){
                x = x*x;
                nn /= 2;
            }else{
                ans *= x;
                nn = nn-1;
            }
        }
        if(n < 0) return (double)1.0/(double)ans;
        return ans;
    }
}
