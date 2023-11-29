import java.util.HashSet;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        HashSet<Character> check = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<my_string.length();i++){
            char c = my_string.charAt(i);
            if(!check.contains(c)){
                check.add(c);
                sb.append(c);
            }
        }
        answer = sb.toString();
        return answer;
    }
}