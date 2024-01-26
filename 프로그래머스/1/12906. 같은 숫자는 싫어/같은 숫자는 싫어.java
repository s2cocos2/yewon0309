import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        List<Integer> list = new ArrayList<>();
        int num = arr[0];
        list.add(arr[0]);
        for(int i=0;i<arr.length;i++){
            if(num != arr[i]){
                list.add(arr[i]);
                num = arr[i];
            }
        }

        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();

        return answer;
    }
}