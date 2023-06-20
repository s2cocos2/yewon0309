class Solution {
    public long solution(long n) {
        long answer = 0;
        double nS = Math.sqrt(n);

        if(nS%1==0){
            answer = ((long)nS + 1)*((long)nS + 1);
        } else answer = -1;
        return answer;
    }
}