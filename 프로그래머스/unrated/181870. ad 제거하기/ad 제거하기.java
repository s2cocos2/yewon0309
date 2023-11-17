import java.util.*;
class Solution {
    public String[] solution(String[] strArr) {
        ArrayList<String> listAnswer = new ArrayList<>();
        for(int i=0;i< strArr.length;i++) {
            if(!strArr[i].contains("ad")){
                listAnswer.add(strArr[i]);
            }
        }
        String[] answer = listAnswer.toArray(new String[0]);
        return answer;
    }
}