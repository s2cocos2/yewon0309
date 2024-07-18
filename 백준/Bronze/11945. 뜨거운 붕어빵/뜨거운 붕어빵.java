import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str1 = br.readLine().split(" ");
        int N = Integer.parseInt(str1[0]);
        int M = Integer.parseInt(str1[1]);

        String[] str2 = new String[N];
        for(int i=0;i<N;i++){
            str2[i] = br.readLine();
        }


        for(int i=0;i<N;i++) {
            StringBuilder sb = new StringBuilder(str2[i]);
            sb.reverse();
            System.out.println(sb.toString());
        }
    }
}