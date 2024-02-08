import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        List<Integer> stk = new ArrayList<>();
        int i=0;
        while(i<arr.length){
            if(stk.isEmpty()){
                stk.add(arr[i]);
                i++;
            } else if(!stk.isEmpty() && stk.get(stk.size()-1) == arr[i]){
                stk.remove(stk.size()-1);
                i++;
            } else if(!stk.isEmpty() && stk.get(stk.size()-1) != arr[i]){
                stk.add(arr[i]);
                i++;
            }
        }

        if(stk.isEmpty()){
            answer = new int[]{-1};
        } else {
            answer = stk.stream().mapToInt(Integer::intValue).toArray();
        }
        return answer;
    }
}