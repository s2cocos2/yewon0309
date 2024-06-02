import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> list = new ArrayList<>();

        for(int i=l;i<=r;i++){
            String iStr = String.valueOf(i);
            boolean b = true;
            for(int j=0;j<iStr.length();j++){
                // char c = iStr.charAt(j);
                if(iStr.charAt(j) != '0' && iStr.charAt(j) != '5'){
                    b = false;
                    break;
                }
            }
            if(b){
                list.add(i);
            }
        }

        Collections.sort(list);
        int[] answer;
        if(list.isEmpty()){
            answer = new int[]{-1};
        } else {
            answer = list.stream().mapToInt(Integer::intValue).toArray();
        }
        return answer;
    }
}