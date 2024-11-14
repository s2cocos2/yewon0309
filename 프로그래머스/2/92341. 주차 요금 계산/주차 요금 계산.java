import java.util.*;
import java.util.Map.Entry;

class Solution {
    public int[] solution(int[] fees, String[] records) {
        int basicTime = fees[0];
        int basicFee = fees[1];
        int unitTime = fees[2];
        int unitFee = fees[3];

        Map<String, Integer> parkingRecords = new HashMap<>();
        Map<String, Integer> inTime = new HashMap<>();

        for (String record : records) {
            String[] parts = record.split(" ");
            String time = parts[0];
            String carNumber = parts[1];
            String status = parts[2];

            int minutes = timeToMinutes(time);

            if (status.equals("IN")) {
                inTime.put(carNumber, minutes);
            } else if (status.equals("OUT")) {
                int parkedTime = minutes - inTime.remove(carNumber);
                parkingRecords.put(carNumber, parkingRecords.getOrDefault(carNumber, 0) + parkedTime);
            }
        }

        for (String carNumber : inTime.keySet()) {
            int parkedTime = timeToMinutes("23:59") - inTime.get(carNumber);
            parkingRecords.put(carNumber, parkingRecords.getOrDefault(carNumber, 0) + parkedTime);
        }

        // 요금 계산
        List<Entry<String, Integer>> entryList = new ArrayList<>(parkingRecords.entrySet());
        entryList.sort(Entry.comparingByKey());

        int[] result = new int[entryList.size()];
        int index = 0;
        for (Entry<String, Integer> entry : entryList) {
            int totalTime = entry.getValue();
            int fee;
            if (totalTime <= basicTime) {
                fee = basicFee;
            } else {
                fee = basicFee + (int) Math.ceil((double) (totalTime - basicTime) / unitTime) * unitFee;
            }
            result[index++] = fee;
        }

        return result;
    }

    private int timeToMinutes(String time) {
        String[] parts = time.split(":");
        int hours = Integer.parseInt(parts[0]);
        int minutes = Integer.parseInt(parts[1]);
        return hours * 60 + minutes;
    }
}
//