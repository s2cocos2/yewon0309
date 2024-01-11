import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int i=0;i<arr.length;i++){
            list.add(arr[i]);
        }


        while (Math.log(list.size()) / Math.log(2) % 1 != 0){
            list.add(0);
        }

        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}