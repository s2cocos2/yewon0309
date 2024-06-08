import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int n) {
        List<Integer> listAnswer = new ArrayList<>();
        while (n!=1){
            listAnswer.add(n);
            if(n%2==0){
                n = n/2;
            } else {
                n = 3 * n +1;
            }
        }
        listAnswer.add(1);

        int[] answer = listAnswer.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}