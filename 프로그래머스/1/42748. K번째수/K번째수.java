import java.util.Arrays;

public class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] result = new int[commands.length]; 

        for (int index = 0; index < commands.length; index++) {
            int i = commands[index][0];
            int j = commands[index][1];
            int k = commands[index][2];

            // array의 i번째부터 j번째까지 자르기
            int[] subArray = Arrays.copyOfRange(array, i - 1, j);

            Arrays.sort(subArray);

            result[index] = subArray[k - 1];
        }

        return result;
    }
}
