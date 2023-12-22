class Solution {
    public int solution(int n) {
        int answer = 0;
        int fact = 1;
        int i=1;

        while(true){
            fact *= i;
            if(fact > n) break;
            i++;
        }

        answer = i-1;
        return answer;
    }
}