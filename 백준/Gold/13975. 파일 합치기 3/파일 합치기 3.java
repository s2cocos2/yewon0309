import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i=0;i<T;i++) {
            int K = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            PriorityQueue<Long> pq = new PriorityQueue<>();

            for (int n=0;n<K;n++) {
                pq.offer(Long.parseLong(st.nextToken()));
            }

            long total = 0;

            while (pq.size() > 1) {
                long num1 = pq.poll();
                long num2 = pq.poll();

                long sum = num1 + num2;
                total += sum;

                pq.offer(sum);
            }

            sb.append(total).append("\n");
        }

        System.out.print(sb.toString());
    }
}
