class Solution {
    public int solution(int[][] board) {
        int answer = 0;

        int[] dx = {-1, -1, -1, 0, 1, 1, 1, 0};
        int[] dy = {-1, 0, 1, 1, 1, 0, -1, -1};

        int n = board.length;
        int safe = n * n;

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(board[i][j] == 1){
                    safe--;
                    for(int k=0;k<8;k++){
                        int nx = i + dx[k];
                        int ny = j + dy[k];
                        if(nx >= 0 && nx < n && ny >= 0 && ny < n && board[nx][ny] == 0){
                            board[nx][ny] = -1;
                            safe--;
                        }
                    }
                }
            }
        }

        answer = safe;
        return answer;
    }
}