import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        for(int i=0;i< rank.length;i++){
            if(attendance[i] == true){
                list.add(rank[i]);
            }
        }

        Collections.sort(list);

        List<Integer> list2 = new ArrayList<>();
        for(int i=0;i<3;i++){
            int num = list.get(i);
            for(int j=0;j<rank.length;j++){
                if(num == rank[j]){
                    list2.add(j);
                }
            }
        }

        answer = (list2.get(0) * 10000) + (list2.get(1) * 100) + list2.get(2);
        return answer;
    }
}