import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        String[] str = new String[intStrs.length];
        List<Integer> answerList = new ArrayList<>();
        int num = 0;

        for(int i=0;i< intStrs.length;i++){
            str[i] = intStrs[i].substring(s, s+l);
            num = Integer.parseInt(str[i]);
            if(num > k){
                answerList.add(num);
            }
        }
        
        int[] answer = Arrays.stream(answerList.toArray(new Integer[0])).mapToInt(Integer::intValue).toArray();
        return answer;
    }
}