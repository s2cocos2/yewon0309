import java.util.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Map<String, String> map = new HashMap<>();

        // map의 key값에는 노래제목을, value값에는 세 음을 저장
        for(int i=0;i<N;i++){
            String[] str = br.readLine().split(" ");
            map.put(str[1], str[2] + str[3] + str[4]);
        }

        List<String> answer = new ArrayList<>();
        for(int i=0;i<M;i++){
            // 맞춰야할 세 음
            String str = br.readLine().replace(" ", "");

            List<String> find = new ArrayList<>();
            //map의 key값들을(저장한 노래 제목들)
            List<String> list = new ArrayList<>(map.keySet());
            for(int j=0;j<map.size();j++){
                String key = list.get(j);
                // 노래 제목으로 찾은 세 음들을 가져옴
                String value = map.get(key);
                // 저장되어 있는 세음과 일치하는 것이 있으면 list에 노래제목을 저장
                if(value.equals(str)){
                    find.add(key);
                }
            }

            if(find.isEmpty()){
                answer.add("!");
            } else if(find.size() > 1){
                answer.add("?");
            } else {
                answer.add(find.get(0));
            }

        }

        for(int i=0;i<answer.size();i++){
            System.out.println(answer.get(i));
        }

    }
}
