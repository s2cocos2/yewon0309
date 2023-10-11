import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = {};
        List<Integer> list =  Arrays.stream(numbers).boxed().collect(Collectors.toList());
        if(direction.equals("right")){
            list.add(0,numbers[numbers.length-1]);
            list.remove(numbers.length);
        } else {
            list.add(numbers.length,numbers[0]);
            list.remove(0);
        }
        answer = list.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}