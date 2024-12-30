public class Solution {
    public int solution(int n) {
        String number = String.valueOf(n);
        int answer = 0;

        for (char digit : number.toCharArray()) {
            answer += Character.getNumericValue(digit);
        }

        return answer;
    }
}
