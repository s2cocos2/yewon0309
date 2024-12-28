import java.util.Arrays;

public class Solution {
    public int[] solution(int[] array, int[][] commands) {
        return Arrays.stream(commands)
            .mapToInt(command -> {
                int i = command[0];
                int j = command[1];
                int k = command[2];

                return Arrays.stream(array, i - 1, j)
                             .sorted()
                             .toArray()[k - 1];
            })
            .toArray();
    }
}
