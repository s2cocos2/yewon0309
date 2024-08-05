import java.util.*;

class Main {
    static int N, M, R, G, B;
    static int[][] screen;
    static boolean[][] visited;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();
        screen = new int[N][M];
        visited = new boolean[N][M];

        // RGB 평균 값으로 screen을 다시 저장
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                R = sc.nextInt();
                G = sc.nextInt();
                B = sc.nextInt();

                screen[i][j] = (R + G + B) / 3;
            }
        }

        int T = sc.nextInt();

        // 경계값을 기준으로 screen을 다시 저장
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                if(screen[i][j] >= T){
                    screen[i][j] = 255;
                } else {
                    screen[i][j] = 0;
                }
            }
        }

        int count = 0;
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                if(screen[i][j] == 255 && !visited[i][j]){
                    dfs(i, j);
                    count++;
                }
            }
        }

        System.out.println(count);



    }

    public static void dfs(int x, int y){
        visited[x][y] = true;
        for(int i=0;i<4;i++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx >= 0 && nx < N && ny >= 0 && ny < M && !visited[nx][ny] && screen[nx][ny] == 255){
                dfs(nx, ny);
            }
        }
    }
}