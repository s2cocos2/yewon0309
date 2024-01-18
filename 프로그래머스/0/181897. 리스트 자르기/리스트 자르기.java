import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int[] answer = {};

        if(n == 1){
                answer = Arrays.copyOfRange(num_list, 0, slicer[1]+1);
        }

        if(n == 2){
            answer = Arrays.copyOfRange(num_list, slicer[0], num_list.length);
        }

        if(n == 3){
            answer = Arrays.copyOfRange(num_list, slicer[0], slicer[1]+1);
        }

        List<Integer> list = new ArrayList<>();
        if(n == 4){
            for(int i=slicer[0];i<slicer[1]+1;i+=slicer[2]){
                list.add(num_list[i]);
            }
            answer = list.stream().mapToInt(Integer::intValue).toArray();
        }

        return answer;
    }
}