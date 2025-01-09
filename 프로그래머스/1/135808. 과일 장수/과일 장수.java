import java.util.PriorityQueue;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        
        for (int s : score) {
            pq.add(s);
        }
        
        // 큐에서 m개씩 묶어서 처리
        while (pq.size() >= m) {
            int minInBox = Integer.MAX_VALUE;

            for (int i = 0; i < m; i++) {
                minInBox = Math.min(minInBox, pq.poll());
            }
            
            answer += minInBox * m;
        }
        
        return answer;
    }
}
