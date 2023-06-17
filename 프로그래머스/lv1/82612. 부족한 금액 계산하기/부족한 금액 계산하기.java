class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        long totalP = 0;

        for(int i=0;i<count;i++){
            totalP +=price + price * i;
        }
        long leftM = (long) money - totalP;
        if(leftM>=0){
            answer = 0;
        } else if(leftM<0){
            answer = totalP-(long)money;
        }
        return answer;
    }
}