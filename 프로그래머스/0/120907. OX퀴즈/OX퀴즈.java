import java.util.*;

class Solution {
    public String[] solution(String[] quiz) {
        List<String> list = new ArrayList<>();
        for(int i=0;i<quiz.length;i++){
            String[] str = quiz[i].split(" ");
            int X = Integer.parseInt(str[0]);
            int Y = Integer.parseInt(str[2]);
            int Z = Integer.parseInt(str[4]);
            int num = 0;
            if(str[1].contains("-")){
                num = X - Y;
            } else if(str[1].contains("+")){
                num = X + Y;
            }

            if(num == Z){
                list.add("O");
            } else {
                list.add("X");
            }
        }

        String[] answer = list.toArray(new String[0]);
        return answer;
    }
}