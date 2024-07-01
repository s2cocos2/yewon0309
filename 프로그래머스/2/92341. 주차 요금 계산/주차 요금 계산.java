import java.util.*;
import java.util.Map.Entry;

class Solution {
    public int[] solution(int[] fees, String[] records) {
        Map<String, Integer> inTime = new HashMap<>();
        Map<String, Integer> totalTime = new HashMap<>();

        for (String record : records) {
            String[] parts = record.split(" ");
            String time = parts[0];
            String number = parts[1];
            String status = parts[2];

            int minutes = convertToMinutes(time);

            if (status.equals("IN")) {
                inTime.put(number, minutes);
            } else {
                int parkedTime = minutes - inTime.remove(number);
                totalTime.put(number, totalTime.getOrDefault(number, 0) + parkedTime);
            }
        }

        for (String number : inTime.keySet()) {
            int parkedTime = 1439 - inTime.get(number);
            totalTime.put(number, totalTime.getOrDefault(number, 0) + parkedTime);
        }

        List<Entry<String, Integer>> entryList = new ArrayList<>(totalTime.entrySet());
        entryList.sort(Entry.comparingByKey());

        int[] answer = new int[entryList.size()];
        for (int i = 0; i < entryList.size(); i++) {
            Entry<String, Integer> entry = entryList.get(i);
            answer[i] = calculateFee(entry.getValue(), fees);
        }

        return answer;
    }

    private int convertToMinutes(String time) {
        String[] parts = time.split(":");
        int hours = Integer.parseInt(parts[0]);
        int minutes = Integer.parseInt(parts[1]);
        return hours * 60 + minutes;
    }

    private int calculateFee(int time, int[] fees) {
        int basicTime = fees[0];
        int basicFee = fees[1];
        int unitTime = fees[2];
        int unitFee = fees[3];

        if (time <= basicTime) {
            return basicFee;
        } else {
            return basicFee + (int) Math.ceil((double) (time - basicTime) / unitTime) * unitFee;
        }
    }
}
//