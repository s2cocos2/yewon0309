import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        List<Integer> arrList = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            arrList.add(arr[i]);
        }

        List<Integer> answerList = new ArrayList<>();


        for(int i=0;i<queries.length;i++){
            List<Integer> list = new ArrayList<>();
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];
            for(int j=s;j<=e;j++){
                if(arr[j] > k){
                    list.add(arr[j]);
                }
            }
            if(list.isEmpty()){
                answerList.add(-1);
            } else {
                answerList.add(Collections.min(list));
            }
        }

        int[] answer = answerList.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}