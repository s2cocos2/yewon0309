import java.util.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String answer = " ";
        HashSet<String> set = new HashSet<>();
        for(int i=0;i<N;i++){
            String str = br.readLine();
            set.add(str);

            StringBuilder sb = new StringBuilder(str);
            String sbReverse = sb.reverse().toString();

            if(set.contains(sbReverse)){
                answer = sbReverse;
                break;
            }
        }


        int length = answer.length();
        char c = answer.charAt(length/2);
        System.out.println(length + " " + c);


    }
}
