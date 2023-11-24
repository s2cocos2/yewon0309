class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        String numStr = num + "";
        String kStr = k + "";

        if(numStr.contains(kStr)){
            answer = numStr.indexOf(kStr) + 1;
        } else {
            answer = -1;
        }
        return answer;
    }
}