import java.util.Scanner;

public class JosephusProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.close();
        System.out.println(solve(n, k));
    }

    public static int solve(int n, int k){
        if(n == 1) return 0;

        return (solve(n-1, k)+k)%k;
    }
}
