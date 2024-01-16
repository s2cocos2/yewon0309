import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        int answer = 0;

        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0;i<strArr.length;i++){
            map.put(strArr[i].length(), map.getOrDefault(strArr[i].length(), 0)+1);
        }

        int count = 0;
        Object[] arr = map.values().toArray();
        for(int i=0;i<arr.length;i++){
            if((Integer)arr[i] > count){
                count = (Integer)arr[i];
            }
        }

        answer = count;
        return answer;
    }
}