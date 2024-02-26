class Solution {
    public int[][] solution(int[][] arr) {
        int row = arr.length;
        int column = arr[0].length;
        int max = Math.max(row, column);
        int[][] answer = new int[max][max];

        for(int i=0;i<max;i++){
            for(int j=0;j<max;j++){
                if(i<row && j <column){
                    answer[i][j] = arr[i][j];
                } else {
                    answer[i][j] = 0;
                }
            }
        }
        return answer;
    }
}