import java.util.Arrays;

class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int paintedUntil = 0;

        for (int start : section) {
            if (start <= paintedUntil) {
                continue;
            }

            paintedUntil = start + m - 1;
            answer++;
        }

        return answer;
    }
}
