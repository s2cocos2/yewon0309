public class Solution {
    public String solution(String[] seoul) {
        int index = -1;
        int i = 0;
        
        for (String name : seoul) {
            if (name.equals("Kim")) {
                index = i;
                break;
            }
            i++;
        }
        
        return "김서방은 " + index + "에 있다";
    }
}
