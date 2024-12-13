import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {
        if (arr.length == 1) {
            return new int[] { -1 };
        }

        int min = Arrays.stream(arr).min().getAsInt();

        ArrayList<Integer> resultList = new ArrayList<>();
        for (int num : arr) {
            if (num != min) {
                resultList.add(num);
            }
        }

        return resultList.stream().mapToInt(i -> i).toArray();
    }
}
