import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> solution(String[] names) {
        List<String> result = new ArrayList<>();

        for (int i = 0; i < names.length; i += 5) {
            result.add(names[i]);
        }

        return result;
    }
}
