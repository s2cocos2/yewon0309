public class Solution {
    public long solution(int k, int d) {
        long count = 0;
        long dSquared = (long) d * d;

        for (long x = 0; x <= d; x += k) {
            long maxY = (long) Math.sqrt(dSquared - x * x);
            count += (maxY / k) + 1;
        }

        return count;
    }
}
//