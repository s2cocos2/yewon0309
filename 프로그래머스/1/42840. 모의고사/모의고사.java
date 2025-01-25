import java.util.*;
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] answers) {
        int[][] patterns = {
            {1, 2, 3, 4, 5},
            {2, 1, 2, 3, 2, 4, 2, 5},
            {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
        };

        int[] scores = new int[3];
        for (int i = 0; i < patterns.length; i++) {
            int[] pattern = patterns[i];
            scores[i] = (int) IntStream.range(0, answers.length)
                                       .filter(j -> answers[j] == pattern[j % pattern.length])
                                       .count();
        }

        int maxScore = Arrays.stream(scores).max().orElse(0);

        return IntStream.range(0, scores.length)
                        .filter(i -> scores[i] == maxScore)
                        .map(i -> i + 1)
                        .toArray();
    }
}
