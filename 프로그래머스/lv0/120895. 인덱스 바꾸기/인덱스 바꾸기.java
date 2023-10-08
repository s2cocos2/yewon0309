class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        StringBuffer answerList = new StringBuffer();

        for(int i=0;i<my_string.length();i++){
            if(i == num1){
                answerList.append(my_string.charAt(num2));
            } else if(i == num2){
                answerList.append(my_string.charAt(num1));
            } else {
                answerList.append(my_string.charAt(i));
            }
        }

        answer = answerList.toString();
        return answer;
    }
}