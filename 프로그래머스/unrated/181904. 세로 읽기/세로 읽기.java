class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        for(int i=c-1;i<my_string.length();i += m){
            sb.append(my_string.charAt(i));
        }
        answer = sb.toString();
        return answer;
    }
}