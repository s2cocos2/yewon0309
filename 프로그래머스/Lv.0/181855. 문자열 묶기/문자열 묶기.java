import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        int answer = 0;

        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0;i<strArr.length;i++){
            int key = strArr[i].length();
            int value = map.getOrDefault(key, 0) + 1;
            map.put(key, value);
        }

        int count = 0;
        count = Collections.max(map.values());

        answer = count;
        return answer;
    }
}