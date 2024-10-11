public class Solution {
    public int solution(int[] numbers) {
        int totalSum = 45;
        int sumOfNumbers = 0;
        for (int num : numbers) {
            sumOfNumbers += num;
        }

        return totalSum - sumOfNumbers;
    }
}
