import java.util.*;

class Solution {
    public int[] solution(long n) {
        String str = String.valueOf(n);
        int leng = str.length();
        int[] answer = new int[leng];

        for(int i=leng-1,j=0;i>=0;i--,j++){
            answer[j] = str.charAt(i)-'0';
            System.out.println("answer = " + Arrays.toString(answer));
        }
        return answer;
    }
}