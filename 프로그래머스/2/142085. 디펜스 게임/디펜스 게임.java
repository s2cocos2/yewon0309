import java.util.PriorityQueue;
import java.util.Collections;

public class Solution {
    public int solution(int n, int k, int[] enemy) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        int roundCount = 0;

        for (int i = 0; i < enemy.length; i++) {
            maxHeap.add(enemy[i]);

            n -= enemy[i];

            if (n < 0) {
                if (k > 0 && !maxHeap.isEmpty()) {
                    n += maxHeap.poll();
                    k--;
                } else {

                    return roundCount;
                }
            }
            roundCount++;
        }

        return roundCount;
    }
}
