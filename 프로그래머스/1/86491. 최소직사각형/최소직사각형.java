class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int maxWidth = 0;
        int maxLength = 0;
        for(int i=0;i<sizes.length;i++){
            int width = Math.max(sizes[i][0], sizes[i][1]);
            int length = Math.min(sizes[i][0], sizes[i][1]);

            maxWidth = Math.max(maxWidth, width);
            maxLength = Math.max(maxLength, length);
        }

        answer = maxLength * maxWidth;
        return answer;
    }
}