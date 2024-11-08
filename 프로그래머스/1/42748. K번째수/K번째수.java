import java.util.Arrays;

public class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] result = new int[commands.length];

        for (int c = 0; c < commands.length; c++) {
            int i = commands[c][0];
            int j = commands[c][1];
            int k = commands[c][2];
            
            int[] subArray = Arrays.copyOfRange(array, i - 1, j);

            Arrays.sort(subArray);
            
            result[c] = subArray[k - 1];
        }

        return result;
    }
}
