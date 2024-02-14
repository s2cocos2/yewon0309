import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public String solution(int[] food) {
        String answer = "";
        List<Integer> list = new ArrayList<>();
        for(int i=1;i<food.length;i++){
            for(int j=1;j<=food[i]/2;j++){
                list.add(i);
            }
        }
        List<Integer> list2 = new ArrayList<>(list);
        Collections.sort(list2, Collections.reverseOrder());

        list.add(0);
        list.addAll(list2);

        StringBuilder sb = new StringBuilder();
        for(int i=0;i<list.size();i++){
            sb.append(list.get(i));
        }

        answer = sb.toString();
        return answer;
    }
}