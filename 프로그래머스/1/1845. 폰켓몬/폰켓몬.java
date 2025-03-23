import java.util.stream.Collectors;
import java.util.*;

class Solution {
    public int solution(int[] nums) {
        return Math.min(nums.length / 2, (int) Arrays.stream(nums).boxed().collect(Collectors.toSet()).size());
    }
}
