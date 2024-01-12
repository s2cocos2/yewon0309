import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public String[] solution(String myStr) {
        String[] arr = myStr.split("a|b|c");
        List<String> str = new ArrayList<>(Arrays.asList(arr));
        str.removeAll(Arrays.asList("", null));

        String[] answer;
        if(str.isEmpty()){
            answer = new String[]{"EMPTY"};
        } else {
            answer = str.toArray(new String[0]);
        }
        return answer;
    }
}