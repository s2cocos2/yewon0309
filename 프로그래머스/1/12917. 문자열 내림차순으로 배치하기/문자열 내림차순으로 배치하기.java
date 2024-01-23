import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] str;

        List<String> list = new ArrayList<>();

        for (int i=0;i<s.length();i++){
            char c = s.charAt(i);
            list.add(String.valueOf(c));
        }

        Collections.sort(list, Collections.reverseOrder());
        str = list.toArray(new String[0]);
        for(int i=0;i<str.length;i++){
            answer += str[i];
        }
        return answer;
    }
}