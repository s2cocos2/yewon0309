import java.util.*;

class Main {
    static int N, K;
    static int[] visited = new int[100001];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        K = sc.nextInt();
        
        if(N == K){
            System.out.println(0);
        } else {
            System.out.println(bfs(N));
        }
    }

    public static int bfs(int n){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(n);
        // 방문한 위치를 1로 저장
        visited[n] = 1;
        final int LEFT = 0;
        final int RIGHT = 1;

        while (!queue.isEmpty()){
            int now = queue.poll();

            for(int i=0;i<3;i++){
                int next;
                if(i == LEFT){
                    next = now -1;
                } else if(i == RIGHT){
                    next = now + 1;
                } else {
                    next = now * 2;
                }

                // 다음 위치가 동생의 위치와 같다면 반환
                if(next == K){
                    return visited[now];
                }

                // 다음 위치가 0보다 크고, 범위 안에 있고, 방문한 적이 없으면 실행
                if(next >= 0 && next <= 100000 && visited[next] == 0){
                    visited[next] = visited[now] + 1;
                    queue.add(next);
                }
            }
        }
        return -1;
    }
}