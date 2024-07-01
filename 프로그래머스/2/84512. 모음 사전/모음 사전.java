import java.util.*;

class Solution {
    public static final char[] VOWELS = {'A', 'E', 'I', 'O', 'U'};
    public static final int[] FACTORS = {781, 156, 31, 6, 1};

    public int solution(String word) {
        int position = 0;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            int index = getIndex(c);
            position += index * FACTORS[i] + 1;
        }
        return position;
    }

    private int getIndex(char c) {
        for (int i = 0; i < VOWELS.length; i++) {
            if (VOWELS[i] == c) {
                return i;
            }
        }
        return -1;
    }
}
//