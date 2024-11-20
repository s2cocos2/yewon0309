import java.util.ArrayList;

class Solution {
    public int[] solution(long n) {
        String numStr = Long.toString(n);
        int[] result = new int[numStr.length()];

        for (int i = 0; i < numStr.length(); i++) {
            result[i] = numStr.charAt(numStr.length() - 1 - i) - '0';
        }

        return result;
    }
}
