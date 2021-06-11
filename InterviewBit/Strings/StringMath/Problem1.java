package InterviewBit.Strings.StringMath;

// https://www.interviewbit.com/problems/integer-to-roman/
// Integer to Roman

public class Problem1 {
    public String intToRoman(int A) {
        StringBuilder sb = new StringBuilder();

        int m = A/1000;
        for(int i = 1; i <= m; i++){
            sb.append("M");
        }
        A = A%1000;

        if(A >= 900){
            sb.append("CM");
            A = A%900;
        }
        if(A >= 500){
            sb.append("D");
            A = A%500;
        }
        if(A >= 400){
            sb.append("CD");
            A = A%400;
        }
        if(A >= 100){
            m = A/100;
            for(int i = 1; i <= m; i++) sb.append("C");
            A = A%100;
        }
        if(A >= 90){
            sb.append("XC");
            A = A%90;
        }
        if(A >= 50){
            sb.append("L");
            A = A%50;
        }
        if(A >= 40){
            sb.append("XL");
            A = A%40;
        }
        if(A >= 10){
            m = A/10;
            for(int i = 1; i <= m; i++) sb.append("X");
            A = A%10;
        }
        if(A == 9){
            sb.append("IX");
            A = A%9;
        }
        if(A >= 5){
            sb.append("V");
            A = A%5;
        }
        if(A == 4){
            sb.append("IV");
            A = A%4;
        }
        if(A >= 1){
            for(int i = 1; i <= A; i++) sb.append("I");
        }

        return sb.toString();
    }
}
