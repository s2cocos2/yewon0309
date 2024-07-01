import java.util.*;

class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        
        Set<Integer> leftSet = new HashSet<>();
        Set<Integer> rightSet = new HashSet<>();
        
        int[] rightCount = new int[10001];
        for (int t : topping) {
            rightSet.add(t);
            rightCount[t]++;
        }
        
        int[] leftCount = new int[10001];
        
        for (int i = 0; i < topping.length - 1; i++) {
            int currentTopping = topping[i];
            leftSet.add(currentTopping);
            leftCount[currentTopping]++;
            
            rightCount[currentTopping]--;
            if (rightCount[currentTopping] == 0) {
                rightSet.remove(currentTopping);
            }
            
            if (leftSet.size() == rightSet.size()) {
                answer++;
            }
        }
        return answer;
    }
}
//