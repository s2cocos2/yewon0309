import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        List<Integer> resultList = new ArrayList<>();
        int n = numbers.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int sum = numbers[i] + numbers[j];
                if (!resultList.contains(sum)) {
                    resultList.add(sum);
                }
            }
        }

        Collections.sort(resultList);

        int[] answer = resultList.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}
