import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(String s) {
        int[] answer = {};
        String[] str = s.split("");
        List<Integer> list = new ArrayList<>();

        for(int i=0;i<s.length();i++){
            String f = s.substring(0, i);
            if(!f.contains(str[i])){
                list.add(-1);
            } else {
                for(int j=i-1;j>=0;j--){
                    if(str[j].equals(str[i])){
                        list.add(i-j);
                        break;
                    }
                }
            }
        }

        answer = list.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}