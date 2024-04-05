import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int maxCount =0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<array.length;i++){
            int count = map.getOrDefault(array[i], 0) +1;

            if(count > maxCount){
                maxCount = count;
                answer = array[i];
            } else if(count == maxCount){
                answer = -1;
            }

            map.put(array[i], count);
        }
        return answer;
    }
}