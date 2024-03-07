class Solution {
    public int solution(int[][] dots) {
        int answer = 0;int x1 = dots[0][0];
        int x2 = dots[0][0];
        int y1 = dots[0][1];
        int y2 = dots[0][1];

        for(int i=0;i<dots.length;i++){
            x1 = Math.min(x1, dots[i][0]);
            x2 = Math.max(x2, dots[i][0]);
            y1 = Math.min(y1, dots[i][1]);
            y2 = Math.max(y2, dots[i][1]);
        }

        answer = (x2-x1
                 ) * (y2-y1);
        return answer;
    }
}