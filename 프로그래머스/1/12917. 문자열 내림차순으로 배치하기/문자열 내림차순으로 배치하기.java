import java.util.Arrays;

class Solution {
    public String solution(String s) {
        char[] chars = s.toCharArray();
        
        Arrays.sort(chars);
        
        StringBuilder answer = new StringBuilder(new String(chars));
        return answer.reverse().toString();
    }
}
