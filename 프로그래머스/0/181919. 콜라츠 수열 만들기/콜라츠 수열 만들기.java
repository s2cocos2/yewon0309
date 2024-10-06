import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> solution(int n) {
        List<Integer> collatzSequence = new ArrayList<>();

        while (n != 1) {
            collatzSequence.add(n);
            if (n % 2 == 0) {
                n /= 2;
            } 
            else {
                n = 3 * n + 1;
            }
        }

        // 마지막으로 1을 추가
        collatzSequence.add(1);

        return collatzSequence;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        
        int n = 10;
        List<Integer> result = sol.solution(n);

        System.out.println(result);
    }
}
