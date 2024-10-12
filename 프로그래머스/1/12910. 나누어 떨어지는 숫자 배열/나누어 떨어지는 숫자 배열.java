import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> result = new ArrayList<>();

        for (int num : arr) {
            if (num % divisor == 0) {
                result.add(num);
            }
        }

        if (result.isEmpty()) {
            return new int[] {-1};
        }

        Collections.sort(result);

        return result.stream().mapToInt(i -> i).toArray();
    }
}
