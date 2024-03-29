import java.util.*;

class Solution {
    public String solution(String code) {
        String answer = "";
        String[] str = code.split("");
        List<String> list = new ArrayList<>();
        int mode = 0;
        for(int i=0;i< str.length;i++){
            if(mode == 0){
                if(!str[i].equals("1")){
                    if(i % 2 == 0){
                        list.add(str[i]);
                    }
                } else if(str[i].equals("1")){
                    mode = 1;
                }
            } else if(mode == 1){
                if(!str[i].equals("1")){
                    if(i % 2 == 1){
                        list.add(str[i]);
                    }
                } else if(str[i].equals("1")){
                    mode = 0;
                }
            }
        }

        
        if(list.isEmpty()){
            answer = "EMPTY";
        } else {
            for(int i=0;i<list.size();i++){
                answer += list.get(i);
            }
        }
        return answer;
    }
}