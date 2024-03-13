import java.util.*;

class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];

        List<Integer> list = new ArrayList<>();
        for(int i=0;i<score.length;i++){
            list.add(score[i][0] + score[i][1]);
        }

        list.sort(Collections.reverseOrder());

        for(int i=0;i<list.size();i++){
            answer[i] = list.indexOf(score[i][0] + score[i][1])+1;
        }

        return answer;
    }
}