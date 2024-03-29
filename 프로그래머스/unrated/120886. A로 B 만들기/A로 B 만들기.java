import java.util.Arrays;

class Solution {
    public int solution(String before, String after) {
        int answer = 1;

        if(before.length() != after.length()){
            answer = 0;
        } else {
            char[] beforeChar = before.toCharArray();
            char[] afterChar = after.toCharArray();
            Arrays.sort(beforeChar);
            Arrays.sort(afterChar);
            if(!Arrays.equals(beforeChar, afterChar))
                answer = 0;
        }
        return answer;
    }
}