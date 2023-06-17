import java.util.*;

class Solution {
    public String solution(int a, int b) {
        String answer = "";
        String[] dayW = {"SUN","MON","TUE","WED","THU","FRI","SAT"};

        Calendar c = Calendar.getInstance();
        c.set(2016,a-1,b);
        int tD = c.get(Calendar.DAY_OF_WEEK);

        answer = dayW[tD-1];
        return answer;
    }
}