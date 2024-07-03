import java.util.Arrays;
import java.util.PriorityQueue;

class Solution {
    public int solution(String[][] book_time) {
        // 예약 시작 시간을 기준으로 정렬
        Arrays.sort(book_time, (a, b) -> a[0].compareTo(b[0]));
        
        // 종료 시간을 저장하는 우선순위 큐
        PriorityQueue<String> pq = new PriorityQueue<>();
        
        for (String[] booking : book_time) {
            // 현재 예약의 시작 시간보다 이전에 끝나는 예약을 큐에서 제거
            if (!pq.isEmpty() && pq.peek().compareTo(booking[0]) <= 0) {
                pq.poll();
            }
            // 현재 예약의 종료 시간을 큐에 추가
            pq.add(incrementTimeBy10Minutes(booking[1]));
        }
        
        // 큐에 남아있는 예약의 수가 필요한 객실 수
        return pq.size();
    }
    
    // 시간을 10분 증가시키는 함수
    private String incrementTimeBy10Minutes(String time) {
        String[] parts = time.split(":");
        int hours = Integer.parseInt(parts[0]);
        int minutes = Integer.parseInt(parts[1]);
        minutes += 10;
        if (minutes >= 60) {
            hours += 1;
            minutes -= 60;
        }
        return String.format("%02d:%02d", hours, minutes);
    }
}