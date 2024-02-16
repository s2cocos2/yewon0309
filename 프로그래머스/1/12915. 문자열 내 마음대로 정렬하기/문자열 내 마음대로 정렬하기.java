import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        List<String> list = new ArrayList<>();

        for(int i=0;i<strings.length;i++){
            list.add(strings[i].charAt(n) + strings[i]);
        }

        Collections.sort(list);

        for(int i=0;i<list.size();i++){
           list.set(i, list.get(i).substring(1));
        }

        String[] answer = list.toArray(new String[list.size()]);
        return answer;
    }
}