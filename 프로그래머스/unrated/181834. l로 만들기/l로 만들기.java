class Solution {
    public String solution(String myString) {
        String answer = "";
        answer = myString;
        for(int i=0;i<myString.length();i++){
            char myLetter = myString.charAt(i);
            if(myLetter <'l'){
                answer = answer.replace(myLetter,'l');
            }
        }
        return answer;
    }
}