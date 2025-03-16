public class Solution {
    public long solution(int a, int b) {
        long sum = 0;
        int min = Math.min(a, b);
        int max = Math.max(a, b);
        
        while (min <= max) {
            sum += min;
            min++;
        }
        
        return sum;
    }
}
