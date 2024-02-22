import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        Set<Integer> set = new LinkedHashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
            if(set.size() == k){
                break;
            }
        }

        List<Integer> list = new ArrayList<>(set);

        if(list.size() < k){
            int i=0;
            while (list.size() < k){
                list.add(-1);
                i++;
            }
        }

        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}