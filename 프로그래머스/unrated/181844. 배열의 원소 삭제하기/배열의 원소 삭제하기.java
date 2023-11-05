import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> answerList = new ArrayList<>();

        for(int i=0;i<arr.length;i++){
            answerList.add(arr[i]);
        }

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<delete_list.length;j++){
                if(arr[i] == delete_list[j]){
                    answerList.remove(Integer.valueOf(arr[i]));
                }
            }
        }

        int[] answer = answerList.stream()
                .mapToInt(Integer::intValue)
                .toArray();
        
        return answer;
    }
}