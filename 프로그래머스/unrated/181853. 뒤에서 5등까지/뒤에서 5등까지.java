import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {};
        List<Integer> numList = Arrays.stream(num_list)
            .boxed()
            .collect(Collectors.toList());
        Collections.sort(numList);
        answer = numList.subList(0,5).stream().mapToInt(i->i).toArray();
        return answer;
    }
}