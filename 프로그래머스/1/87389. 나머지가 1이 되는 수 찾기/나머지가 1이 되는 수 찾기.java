import java.util.stream.IntStream;

class Solution {
    public int solution(int n) {
        return IntStream.range(2, n)
                        .filter(x -> n % x == 1)
                        .findFirst()
                        .orElse(-1);
    }
}
