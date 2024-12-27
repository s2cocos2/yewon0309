class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];
        
        int row = 0;
        for (int[] row1 : arr1) {
            int col = 0;
            for (int value1 : row1) {
                answer[row][col] = value1 + arr2[row][col];
                col++;
            }
            row++;
        }
        
        return answer;
    }
}
