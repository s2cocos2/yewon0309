import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int solution(int[] nums) {
        List<Integer> combinations = new ArrayList<>();
        combine(nums, 0, 3, 0, combinations);
        
        int count = 0;
        for (int sum : combinations) {
            if (isPrime(sum)) {
                count++;
            }
        }
        return count;
    }

    private void combine(int[] nums, int start, int r, int sum, List<Integer> combinations) {
        if (r == 0) {
            combinations.add(sum);
            return;
        }
        for (int i = start; i < nums.length; i++) {
            combine(nums, i + 1, r - 1, sum + nums[i], combinations);
        }
    }

    private boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
