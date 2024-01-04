import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        Integer[] arr = Arrays.stream(emergency).boxed().toArray(Integer[]::new);
        Arrays.sort(arr, Collections.reverseOrder());

        for(int i=0;i<emergency.length;i++){
            for(int j=0;j<emergency.length;j++){
                if(arr[i] == emergency[j]){
                    answer[j] = i+1;
                }
            }

        }
        return answer;
    }
}