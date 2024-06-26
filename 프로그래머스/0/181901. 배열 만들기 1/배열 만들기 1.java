import java.util.*;

class Solution {
    public int[] solution(int n, int k) {
        List<Integer> list = new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(i % k == 0){
                list.add(i);
            }
        }

        Collections.sort(list);

        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}