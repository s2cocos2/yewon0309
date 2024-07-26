import java.util.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int dasom = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<N-1;i++){
            pq.add(Integer.parseInt(br.readLine()));
        }

        int count = 0;
        while(!pq.isEmpty() && pq.peek() >= dasom){
            dasom++;
            count++;
            pq.add(pq.poll()-1);
        }

        System.out.println(count);
    }
}
