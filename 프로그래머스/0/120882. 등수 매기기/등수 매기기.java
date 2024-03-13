class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];

        int[] avg = new int[score.length];
        for(int i=0;i< score.length;i++){
            avg[i] = score[i][0] + score[i][1];
        }

        for(int i=0;i<avg.length;i++){
            int rank = 1;
            for(int j=0;j<avg.length;j++){
                if(avg[i] < avg[j]){
                    rank++;
                }
            }
            answer[i] = rank;
        }

        return answer;
    }
}