package InterviewBit.Maths;

import java.util.Scanner;

public class GridUniquePaths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        sc.close();
        System.out.println(uniquePaths(A, B));
    }
    public static int uniquePaths(int A, int B) {
        if(A == 1 || B == 1) return 1;
        return uniquePaths(A-1, B) + uniquePaths(A, B-1);
    }
}
