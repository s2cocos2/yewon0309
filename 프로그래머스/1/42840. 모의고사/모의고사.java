import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] arr3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int[] score = {0, 0, 0};

        for(int i=0;i<answers.length;i++){
            if(arr1[i % arr1.length] == answers[i]){
                score[0]++;
            }
            if(arr2[i % arr2.length] == answers[i]){
                score[1]++;
            }
            if(arr3[i % arr3.length] == answers[i]){
                score[2]++;
            }
        }

        int max = Math.max(score[0], Math.max(score[1], score[2]));
        List<Integer> list = new ArrayList<>();
        for(int i=0;i< score.length;i++){
            if(score[i] == max){
                list.add(i + 1);
            }
        }


        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}