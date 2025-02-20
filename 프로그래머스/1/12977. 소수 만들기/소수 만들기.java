import java.util.*;

class Solution {
    public int solution(int[] nums) {
        List<Integer> sums = new ArrayList<>();
        combination(nums, sums, 0, 0, 0);
        
        int count = 0;
        for (int sum : sums) {
            if (isPrime(sum)) {
                count++;
            }
        }
        return count;
    }

    private void combination(int[] nums, List<Integer> sums, int start, int depth, int sum) {
        if (depth == 3) {
            sums.add(sum);
            return;
        }
        
        for (int i = start; i < nums.length; i++) {
            combination(nums, sums, i + 1, depth + 1, sum + nums[i]);
        }
    }

    private boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
