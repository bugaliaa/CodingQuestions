package InterviewBit.Maths.BaseConversion;

//https://www.interviewbit.com/problems/excel-column-title/
// Excel Colummn Title

public class Problem2 {
    public String convertToTitle(int A) {
        StringBuilder sb = new StringBuilder();
        while(A != 0){
            if(A%26 == 0){
                sb.append("Z");
                A = A - 26;
            }else{
                sb.append((char)(A%26 + 64));
                A = A - A%26;
            }

            A = (int)A/26;
        }

        return sb.reverse().toString();
    }
}
