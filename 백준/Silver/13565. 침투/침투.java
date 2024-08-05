import java.util.*;

public class Main {
    static int N;
    static int M;
    static int[][] map;
    static boolean[][] visited;
    static int[] dx = {1, -1, 0, 0}; // 상하
    static int[] dy = {0, 0, 1, -1}; // 좌우

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        M = sc.nextInt();
        N = sc.nextInt();

        map = new int[M][N];
        visited = new boolean[M][N];

        for(int i=0;i<M;i++){
            String line = sc.next();
            for(int j=0;j<N;j++){
                map[i][j] = line.charAt(j) - '0';
            }
        }

        boolean result = false;

        for(int i=0;i<N;i++){
            if(map[0][i] == 0 && !visited[0][i]){
                result = bfs(0, i);
                if(result) break;
            }
        }

        if(result){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static boolean bfs(int x, int y){
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x, y});
        visited[x][y] = true;

        while(!queue.isEmpty()){
            int[] now = queue.poll();
            int nowX = now[0];
            int nowY = now[1];

            if(nowX == M-1){
                return true;
            }

            for(int i=0;i<4;i++){
                int nextX = nowX + dx[i];
                int nextY = nowY + dy[i];

                if(nextX < 0 || nextY < 0 || nextX >= M || nextY >= N) continue;
                if(visited[nextX][nextY] || map[nextX][nextY] == 1) continue;

                queue.add(new int[]{nextX, nextY});
                visited[nextX][nextY] = true;
            }
        }
        return false;


    }
}