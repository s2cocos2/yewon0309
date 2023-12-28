class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        for(int num=i;num<=j;num++){
            String strNum = num + " ";
            char chK = (char)(k + '0');
            for(int num2=0;num2<strNum.length();num2++){
                if(strNum.charAt(num2) == chK){
                    answer++;
                }
            }
        }
        return answer;
    }
}