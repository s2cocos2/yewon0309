import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        Set<Integer> resultSet = new TreeSet<>();

        int n = numbers.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                resultSet.add(numbers[i] + numbers[j]);
            }
        }

        return resultSet.stream().mapToInt(Integer::intValue).toArray();
    }
}
