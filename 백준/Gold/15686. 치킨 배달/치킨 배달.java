import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

class Main {
    static int N, M;
    static ArrayList<int[]> houses = new ArrayList<>();
    static ArrayList<int[]> chickens = new ArrayList<>();
    static ArrayList<int[]> choice = new ArrayList<>();
    static int result = Integer.MAX_VALUE;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        int[][] map = new int[N][N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                if (map[i][j] == 1) {
                    houses.add(new int[]{i, j});
                }
                if (map[i][j] == 2) {
                    chickens.add(new int[]{i, j});
                }
            }
        }

        visited = new boolean[chickens.size()];
        
        selectChicken(0, 0);
        System.out.println(result);
    }

    static void selectChicken(int depth, int start) {
        if (depth == M) {
            int cityChickenDistance = distance();
            result = Math.min(result, cityChickenDistance);
            return;
        }

        for (int i = start; i < chickens.size(); i++) {
            if (!visited[i]) {
                visited[i] = true;
                choice.add(chickens.get(i));
                selectChicken(depth + 1, i + 1);
                choice.remove(choice.size() - 1);
                visited[i] = false;
            }
        }
    }

    static int distance() {
        int total = 0;

        for (int[] h : houses) {
            int minDistance = Integer.MAX_VALUE;
            for (int[] c : choice) {
                int distance = Math.abs(h[0] - c[0]) + Math.abs(h[1] - c[1]);
                minDistance = Math.min(minDistance, distance);
            }
            total += minDistance;
        }

        return total;
    }
}
