class Solution {
    public int solution(int order) {
        int answer = 0;
        String orderStr = order + "";

        for(int i=0;i<orderStr.length();i++){
            char orderC = orderStr.charAt(i);
            if(orderC == '3' || orderC == '6'|| orderC == '9'){
                answer++;
            }
        }
        return answer;
    }
}