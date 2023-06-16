import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int answer = -1;
        
                List<Integer> intList = new ArrayList<>();
        for(int i=0;i<10;i++){
            intList.add(i);
        }

        for(int num: numbers){
            if(intList.contains(num)){
                intList.remove(Integer.valueOf(num));
            }
        }
        answer = 0;
        for(int num2:intList){
            answer += num2;
        };
        
        return answer;
    }
}