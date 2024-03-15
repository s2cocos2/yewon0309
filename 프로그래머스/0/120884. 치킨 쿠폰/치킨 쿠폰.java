class Solution {
    public int solution(int chicken) {
        int answer = 0;
        int service = 0;
        int left = 0;
        while(chicken >= 10){
            service = chicken / 10;
            left = chicken % 10;
            chicken = service + left;
            answer += service;
        }
        return answer;
    }
}