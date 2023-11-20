import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        List<Integer> answerList = new ArrayList<>();
        for(int i=intervals[0][0];i<intervals[0][1]+1;i++){
            answerList.add(arr[i]);
        }

        for (int i=intervals[1][0];i<intervals[1][1]+1;i++){
            answerList.add(arr[i]);
        }

        int[] answer = answerList.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}