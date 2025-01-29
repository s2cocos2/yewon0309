import java.util.PriorityQueue;

class Solution {
    public int solution(int[] d, int budget) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for (int amount : d) {
            pq.offer(amount);
        }

        int count = 0;
        while (!pq.isEmpty() && budget >= pq.peek()) {
            budget -= pq.poll();
            count++;
        }

        return count;
    }
}
