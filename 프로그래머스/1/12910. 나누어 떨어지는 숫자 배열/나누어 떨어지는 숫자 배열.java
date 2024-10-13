import java.util.Arrays;

public class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] result = Arrays.stream(arr)
                             .filter(num -> num % divisor == 0)
                             .toArray();

        if (result.length == 0) {
            return new int[] {-1};
        }
        
        Arrays.sort(result);
        
        return result;
    }
}
