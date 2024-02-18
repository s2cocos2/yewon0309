

class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        int sl = overwrite_string.length();

        String answer1 = my_string.substring(0, s);
        String answer3 = my_string.substring(s+sl);
        answer = answer1 + overwrite_string + answer3;
        
        return answer;
    }
}