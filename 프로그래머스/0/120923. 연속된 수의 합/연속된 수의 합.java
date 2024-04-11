class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];

        int sum = 0;
        for(int i=0;i<num;i++){
            sum += i;
        }

        int x = total - sum;
        x = x / num;

        for(int i=0;i<num;i++){
            answer[i] = x;
            x++;
        }
        return answer;
    }
}