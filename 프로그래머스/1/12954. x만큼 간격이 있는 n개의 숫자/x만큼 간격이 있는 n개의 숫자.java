import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Long> solution(int x, int n) {
        List<Long> result = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            result.add((long) x * i);
        }
        
        return result;
    }
}
