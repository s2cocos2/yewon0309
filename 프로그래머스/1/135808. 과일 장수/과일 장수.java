import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
            int boxCnt = score.length / m;
            List<Integer> list = new ArrayList<>();
            for(int i=0;i<score.length;i++){
                list.add(score[i]);
            }

            Collections.sort(list, Collections.reverseOrder());

            List<Integer> list2 = new ArrayList<>();
            for(int i=0;i<boxCnt;i++){
                List<Integer> temp = list.subList(i*m, i*m + m);
                int min = Collections.min(temp);
                list2.add(min);
            }


            for(int i=0;i<list2.size();i++){
                answer += list2.get(i) * m;
            }
        return answer;
    }
}