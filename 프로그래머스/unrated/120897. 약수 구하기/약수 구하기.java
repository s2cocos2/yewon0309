import java.util.*;

class Solution {
    public int[] solution(int n) {
        List<Integer> answerList = new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(n%i==0){
                answerList.add(i);
                answerList.add(n/i);
            }
        }
        int[] answer =  answerList.stream().distinct().sorted().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}