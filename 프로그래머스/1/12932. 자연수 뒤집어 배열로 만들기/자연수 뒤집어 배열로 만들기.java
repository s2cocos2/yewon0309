import java.util.stream.IntStream;

class Solution {
    public int[] solution(long n) {
        char[] arr = new StringBuilder(String.valueOf(n)).reverse().toString().toCharArray();
        return IntStream.range(0, arr.length)
                        .map(i -> arr[i] - '0')
                        .toArray();
    }
}
