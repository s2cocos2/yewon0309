class Solution {
    public int solution(String s) {
        int result = 0;
        boolean isNegative = false;

        int startIndex = 0;
        if (s.charAt(0) == '-') {
            isNegative = true;
            startIndex = 1;
        } else if (s.charAt(0) == '+') {
            startIndex = 1;
        }

        for (int i = startIndex; i < s.length(); i++) {
            result = result * 10 + (s.charAt(i) - '0');
        }

        if (isNegative) {
            result = -result;
        }

        return result;
    }
}
