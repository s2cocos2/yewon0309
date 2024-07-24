import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int count = 0;

        Set<String> set = new HashSet<>();
        for(int i=0;i<N;i++){
            String str = br.readLine();

            if(str.equals("ENTER")){
                set.clear();
            } else {
                if(!set.contains(str)){
                    set.add(str);
                    count++;
                }
            }
        }

        System.out.println(count);









    }
}
