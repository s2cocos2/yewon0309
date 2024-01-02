class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] strList = my_string.split("\\D+");

        for(int i=0;i< strList.length;i++){
            if(!strList[i].isEmpty()){
                answer += Integer.parseInt(strList[i]);
            }
        }
        return answer;
    }
}