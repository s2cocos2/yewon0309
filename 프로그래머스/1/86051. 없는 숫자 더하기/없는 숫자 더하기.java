import java.util.HashSet;

public class Solution {
    public int solution(int[] numbers) {
        int totalSum = 45;
        int numbersSum = 0;

        for (int number : numbers) {
            numbersSum += number;
        }

        return totalSum - numbersSum;
    }
}
