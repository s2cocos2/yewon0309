import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] array) {
        List<Integer> list =  Arrays.stream(array)
            .boxed()
            .collect(Collectors.toList());
        int max = Arrays.stream(array).max().getAsInt();
        int index = list.indexOf(max);

        int[] answer = {max, index};
        return answer;
    }
}