import java.util.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        List<String> list = new ArrayList<>();
        for(int i=0;i<N;i++){
            list.add(br.readLine());
        }

        String answer = " ";
        for(int i=0;i<list.size();i++){
            StringBuilder sb = new StringBuilder();
            sb.append(list.get(i));
            String strReverse = sb.reverse().toString();

            for(int j=0;j<list.size();j++){
                if(list.contains(strReverse)){
                    answer = list.get(i);
                }
            }
        }

        int length = answer.length();
        char c = answer.charAt(length/2);
        System.out.println(length + " " + c);


    }
}
