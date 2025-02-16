import java.util.PriorityQueue;

public class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] result = new int[commands.length];

        for (int index = 0; index < commands.length; index++) {
            int i = commands[index][0];
            int j = commands[index][1];
            int k = commands[index][2];

            PriorityQueue<Integer> minHeap = new PriorityQueue<>();

            for (int x = i - 1; x < j; x++) {
                minHeap.add(array[x]);
            }

            for (int count = 0; count < k; count++) {
                result[index] = minHeap.poll();
            }
        }

        return result;
    }
}
