import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(long n) {
        List<Integer> digits = new ArrayList<>();
        
        while (n > 0) {
            digits.add((int) (n % 10));
            n /= 10;                  
        }
        
        return digits.stream().mapToInt(Integer::intValue).toArray();
    }
}
