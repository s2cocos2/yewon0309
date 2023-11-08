class Solution {
    public String[] solution(String[] names) {
        int count = 0;
        if(names.length % 5 ==0){
            count = names.length / 5;
        } else {
            count = names.length / 5 + 1;
        }

        String[] answer = new String[count];

        for(int i=0,j=0;i<names.length;i+=5,j++){
            answer[j] = names[i];
        }
        return answer;
    }
}