import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(String s) {
        Map<String, String> numberWords = new HashMap<>();
        numberWords.put("zero", "0");
        numberWords.put("one", "1");
        numberWords.put("two", "2");
        numberWords.put("three", "3");
        numberWords.put("four", "4");
        numberWords.put("five", "5");
        numberWords.put("six", "6");
        numberWords.put("seven", "7");
        numberWords.put("eight", "8");
        numberWords.put("nine", "9");

        for (Map.Entry<String, String> entry : numberWords.entrySet()) {
            s = s.replaceAll(entry.getKey(), entry.getValue());
        }

        return Integer.parseInt(s);
    }
}