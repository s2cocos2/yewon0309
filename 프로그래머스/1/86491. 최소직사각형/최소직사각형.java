import java.util.Arrays;

class Solution {
    public int solution(int[][] sizes) {
        int maxWidth = Arrays.stream(sizes)
                             .mapToInt(size -> Math.max(size[0], size[1]))
                             .max()
                             .orElse(0);

        int maxHeight = Arrays.stream(sizes)
                              .mapToInt(size -> Math.min(size[0], size[1]))
                              .max()
                              .orElse(0);

        return maxWidth * maxHeight;
    }
}
