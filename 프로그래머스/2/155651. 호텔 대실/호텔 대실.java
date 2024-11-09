import java.util.*;

public class Solution {
    public int solution(String[][] book_time) {
        Arrays.sort(book_time, (a, b) -> parseTime(a[0]) - parseTime(b[0]));

        PriorityQueue<Integer> endTimes = new PriorityQueue<>();
        
        for (String[] time : book_time) {
            int start = parseTime(time[0]);
            int end = parseTime(time[1]) + 10;
            if (!endTimes.isEmpty() && endTimes.peek() <= start) {
                endTimes.poll();
            }

            endTimes.add(end);
        }

        return endTimes.size();
    }

    private int parseTime(String time) {
        String[] parts = time.split(":");
        return Integer.parseInt(parts[0]) * 60 + Integer.parseInt(parts[1]);
    }
}
//