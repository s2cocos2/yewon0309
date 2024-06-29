import java.util.Arrays;

class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        Arrays.sort(indices);
        StringBuilder sb = new StringBuilder(my_string);
        for(int i=indices.length-1;i>=0;i--){
            sb.deleteCharAt(indices[i]);
        }

        answer = sb.toString();
        return answer;
    }
}