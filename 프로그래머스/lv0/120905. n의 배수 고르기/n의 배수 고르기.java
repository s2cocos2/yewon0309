import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int n, int[] numlist) {
        int[] answer = {};
        
        //numlist
        List<Integer> intList2 = Arrays.stream(numlist)
            .boxed()
            .collect(Collectors.toList());
        
        int maxNum = Collections.max(intList2);
        
        //int n
        List<Integer> intList = new ArrayList<>();
        for(int i=0;i<=maxNum;i++){
            if(i%n==0){
                intList.add(i);
            }
        }
        
        intList2.retainAll(intList);

        answer = intList2.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}