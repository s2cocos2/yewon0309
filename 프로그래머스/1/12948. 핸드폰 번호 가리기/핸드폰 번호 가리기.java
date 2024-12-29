public class Solution {
    public String solution(String phone_number) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < phone_number.length() - 4; i++) {
            result.append('*');
        }

        result.append(phone_number.substring(phone_number.length() - 4));

        return result.toString();
    }
}
