public class Solution {
    public int solution(long num) {
        return collatz(num, 0);
    }

    public int collatz(long num, int count) {
        if (num == 1) {
            return count;
        }
        if (count >= 500) {
            return -1;
        }
        return collatz(num % 2 == 0 ? num / 2 : num * 3 + 1, count + 1);
    }
}
