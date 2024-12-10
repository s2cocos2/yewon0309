public class Solution {
    boolean solution(String s) {
        int pCount = 0;
        int yCount = 0;
        for (char ch : s.toLowerCase().toCharArray()) {
            if (ch == 'p') {
                pCount++;
            } else if (ch == 'y') {
                yCount++;
            }
        }

        return pCount == yCount;
    }
}
