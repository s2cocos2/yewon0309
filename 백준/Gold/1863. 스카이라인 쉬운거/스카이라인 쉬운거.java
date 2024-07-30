import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[] height = new int[n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            height[i] = Integer.parseInt(st.nextToken());
        }

        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < height.length; i++) {
            int h = height[i];
            if (h == 0) {
                answer += stack.size();
                stack.clear();
            } else {
                while (!stack.isEmpty() && stack.peek() > h) {
                    stack.pop();
                    answer++;
                }
                
                if (stack.isEmpty() || stack.peek() < h) {
                    stack.push(h);
                }
            }
        }
        
        answer += stack.size();

        System.out.println(answer);
    }
}
