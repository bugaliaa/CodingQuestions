package InterviewBit.Maths.NumberEncoding;

// https://www.interviewbit.com/problems/next-similar-number/
// Next Similar Number

public class Problem1 {
    public String solve(String A) {
        char[] a = A.toCharArray();

        int i = a.length-2;
        while(i >= 0 && Character.valueOf(a[i]) >= Character.valueOf(a[i+1])) i--;

        if(i >= 0){
            int j = a.length-1;
            while(Character.valueOf(a[j]) <= Character.valueOf(a[i])) j--;

            char temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }

        int l = i+1;
        int r = a.length-1;
        while(l<r){
            char temp = a[l];
            a[l] = a[r];
            a[r] = temp;
            l++;
            r--;
        }

        if(A.equals(new String(a)) || Double.parseDouble(new String(a)) < Double.parseDouble(A)) return "-1";

        return new String(a);
    }
}
