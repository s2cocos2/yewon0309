import java.util.PriorityQueue;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int num : arr) {
            if (num % divisor == 0) {
                pq.offer(num);
            }
        }

        if (pq.isEmpty()) {
            return new int[]{-1};
        }

        int[] result = new int[pq.size()];
        int index = 0;
        while (!pq.isEmpty()) {
            result[index++] = pq.poll();
        }

        return result;
    }
}
